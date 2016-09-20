package com.rock.teachlibrary.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Rock on 2016/8/16.
 */
public class ImageUtil {

    public static Bitmap sampleBitmap(byte[] bytes,int expandWidth,int expandHeight){
        // 图片加载的配置选项
        BitmapFactory.Options options = new BitmapFactory.Options();
        // 设置为true的时候，BitmapFactory不会真正的去加载图片，它只返回null，但是它会将
        // 图片的像素信息记录下来，记录到options中
        options.inJustDecodeBounds = true;
        // 获取图片的宽和高 存储到options中
        BitmapFactory.decodeByteArray(bytes,0,bytes.length, options);
        // 图片的边缘 宽高
        int outWidth = options.outWidth;
        int outHeight = options.outHeight;
        // 接下来需要进行压缩
        int sampleMax = Math.max(outWidth / expandWidth, outHeight / expandHeight);
        // 设置二次采样的值  inSampleSize 如果小于等于 1，会被用作1来出来
        // 如果大于1，在采样的时候，是宽和高同时进行采样，inSampleSize = 4，
        // 那么宽会压缩为 1/4,高同样被压缩为1/4 ,图片质量实际压缩为以前的1/16
        // 我们设置的采样的值 会被取为 2的n次幂（最靠近的），2的0次幂 1，2的一次幂 2
        // 取值最后会变成 1,2,4,8,16....
        options.inSampleSize = sampleMax;
        // 将只读取边缘属性关闭
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
    }

    public static Bitmap sampleBitmap(byte[] bytes){
        return sampleBitmap(bytes,300,300);
    }

}
