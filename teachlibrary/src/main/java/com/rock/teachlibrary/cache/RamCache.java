package com.rock.teachlibrary.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Android 中使用LruCache内存缓存
 * LRU (last recently use) 最近最少使用原则
 * 创建Lru的时候，我们需要为Lru指定一个最大的空间
 * Lru会自动为我们计算缓存数据的大小以及数据的使用频率，
 * 当Lru分配的空间不足时，会将我们最少使用的从Ram删除
 *
 */
public class RamCache {

    private LruCache<String,Bitmap> mLruCache;

    private static RamCache mRamCache;

    /**
     * 双重判断 去实例化单例，既解决了线程不安全问题，又节约了内存
     * @return
     */
    public static RamCache getInstance(){
        if (mRamCache == null) {
            synchronized (RamCache.class){
                if (mRamCache == null) {
                    mRamCache = new RamCache();
                }
            }
        }
        return mRamCache;
    }

    private RamCache(){
        // 在Android中一般会分配系统最大内存的 1/8 用来作为Ram缓存
        long maxMemory = Runtime.getRuntime().maxMemory();
        // 获取最大内存的 1 / 8
        int expand = (int) (maxMemory / 8);
        // LruCache 的最大占用空间
        mLruCache = new LruCache<String,Bitmap>(expand){
            // 计算Bitmap 大小
            @Override
            protected int sizeOf(String key, Bitmap value) {
                // 行的多少 （高） * 每行占的字节数
                return value.getHeight() * value.getRowBytes();
            }
        };


    }

    /**
     * 向LruCache中存入Bitmap
     * @param url
     * @param bitmap
     */
    public void put(String url, Bitmap bitmap){
        mLruCache.put(url,bitmap);
    }

    /**
     * 从LruCache中取出Bitmap
     * @param url
     * @return
     */
    public Bitmap get(String url){
        return mLruCache.get(url);
    }


}
