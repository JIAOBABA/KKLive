package com.rock.teachlibrary.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.rock.teachlibrary.ImageLoader;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SDCardUtil {
    private static final String TAG = SDCardUtil.class.getSimpleName();
    private static Context context = ImageLoader.getContext();
    /**
     * 获取缓存路径
     */
    public static File getCacheDir(){
//        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "teach";
//        String path = context.getCacheDir() + File.separator + "teach";
//        File file = new File(path);
//        if (!file.exists()) {
//            Log.e(TAG, "getCacheDir: " + path);
//            file.mkdirs();
//        }
        if (context == null) {
            throw new NullPointerException("ImageLoader 还没进行初始化");
        }
        return context.getCacheDir();
    }

    /**
     * url 转换成了它对应的文件存储的绝对路径
     * @param url
     * @return
     */
    public static File urlToPath(String url){
        return  new File(getCacheDir().getAbsolutePath() + File.separator + MD5(url));

    }

    private static String subString(String url){
        int lastIndexOf = url.lastIndexOf("/");
        int lastIndexOfDot = url.lastIndexOf(".");
        return  url.substring(lastIndexOf,lastIndexOfDot);
    }

    /**
     * MD5 是一种摘要算法
     *  单向的，不可逆，所以它呢不属于加密的范畴
     *  它属于一个验证
     *  MD5通常用来验证文件或数据完整
     */
    private static String MD5(String url){

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            // 将传进来的String 变成byte数组进行摘要获取
            md5.update(url.getBytes());
            // 将获取的摘要信息 获取 出来
            byte[] digest = md5.digest();
            return new String(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

}
