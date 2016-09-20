package com.rock.teachlibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

import com.rock.teachlibrary.cache.DiskCache;
import com.rock.teachlibrary.cache.RamCache;
import com.rock.teachlibrary.http.HttpUtil;
import com.rock.teachlibrary.utils.ImageUtil;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *  回顾
 *      创建一个自己的Library去存储通用的代码，Library也是一个module
 *  封装ImageLoader
 *      ① 简单实现异步加载
 *      ② 使用线程池管理异步线程
 *      ③ 添加缓存LruCache，RamCache
 *      ④ 添加缓存到文件 DiskCache
 *      ⑤ 图片压缩
 *
 *
 *
 *
 *
 *
 *
 * 使用线程池对图片加载进行优化
 *  优化：线程创建,销毁
 *
 *
 */
public class ImageLoader {

    private static final String TAG = ImageLoader.class.getSimpleName();
    private static final int LOAD_IMAGE = 400;
    // 指定缓存的最大数量
    private static BlockingQueue<Runnable> mBlockingQueue = new LinkedBlockingQueue<>(128);

    private static Context context;

    public static void init(Context app){
        context = app;
    }

    public static Context getContext(){
        return context;
    }


    // 声明线程池
    /**
     *  线程池实例化
     *  ① int corePoolSize  核心线程数
     *  ② int maximumPoolSize  最大线程数量
     *  ③ 除核心线程之外的线程，它们在闲置下来的时候 多长时间进行销毁
     *  ④ 时间单位  枚举 选择的 秒
     *  ⑤ BlockingQueue 阻塞队列，当我们的线程超过最大线程数时，对请求的线程进行的处理
     *
     */

    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,9,10, TimeUnit.SECONDS,mBlockingQueue);
    // 实例化了一个磁盘缓存
    private static DiskCache mDiskCache = new DiskCache();



    public static void display(final ImageView container, final String url,int defaultResId){
        // 去Ram中找
        Bitmap bitmap = RamCache.getInstance().get(url);
        if (bitmap != null) {
            // 缓存中存在图片，直接显示，并返回
            container.setImageBitmap(bitmap);
            Log.e(TAG, "display: 从Ram中获取" );
            return;
        }

        if (defaultResId != 0) {
            container.setImageResource(defaultResId);
        }

        // 设置标记
        container.setTag(url);
        // 用来接收网络请求回来的数据
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case LOAD_IMAGE:
                        if (container.getTag().equals(url)) {
                            container.setImageBitmap((Bitmap) msg.obj);
                        }
                        break;
                }
            }
        };
        // 网络数据请求 ,使用线程池 提交线程任务
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                // 去磁盘中查找
                Bitmap bitmapFromFile = mDiskCache.get(url);
                if (bitmapFromFile != null) {
                    // 将图片添加到Ram缓存
                    RamCache.getInstance().put(url,bitmapFromFile);
                    // 将图片发回到主线程
                    Message message = Message.obtain();
                    message.what = LOAD_IMAGE;
                    message.obj = bitmapFromFile;
                    handler.sendMessage(message);
                    Log.e(TAG, "run: 从DiskCache中加载" );
                    // 直接返回
                    return;
                }

                // 从网络获取字节数组
                byte[] bytes = HttpUtil.getBytes(url);
                if (bytes == null) {
                    Log.e(TAG, "run: 获取字节数组异常" + url );
                    return;
                }

                // 将字节数组转换为Bitmap
//                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                Bitmap bitmap = ImageUtil.sampleBitmap(bytes);
                // 添加到Ram缓存中
                RamCache.getInstance().put(url,bitmap);
                // 添加到磁盘缓存中
                mDiskCache.put(url,bitmap);
                Message msg = Message.obtain();
                msg.what = LOAD_IMAGE;
                msg.obj = bitmap;
                handler.sendMessage(msg);
            }
        });

//        Thread thread = new Thread(){
//            @Override
//            public void run() {
//                // 从网络获取字节数组
//                byte[] bytes = HttpUtil.getBytes(url);
//                if (bytes == null) {
//                    Log.e(TAG, "run: 获取字节数组异常" + url );
//                    return;
//                }
//                // 将字节数组转换为Bitmap
//                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
//                Message msg = Message.obtain();
//                msg.what = LOAD_IMAGE;
//                msg.obj = bitmap;
//                handler.sendMessage(msg);
//
//            }
//        };
//        thread.start();


    }

    public static void display(final ImageView container, final String url){
        display(container,url,0);
    }

}
