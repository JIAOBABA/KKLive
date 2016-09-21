package com.kk.kklive;

import android.app.Application;
import android.graphics.Bitmap;

import com.rock.teachlibrary.ImageLoader;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import cn.smssdk.SMSSDK;

/**
 * Created by fei on 2016/9/20.
 */
public class KKApp extends Application {
    static ImageOptions options;
    static ImageOptions options2;
    static ImageOptions options3;
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化xutils
        x.Ext.init(this);
        x.Ext.setDebug(true);
        // 初始化teachlibrary
        ImageLoader.init(this);

        SMSSDK.initSDK(this, "174b5e51bb113", "2b545c3e2261c6eb50fa783a30475869");
        //图片加载动画
        options = new ImageOptions.Builder().setUseMemCache(true).setLoadingDrawableId(R.mipmap.kk_room_honor_default_icon).build();

        options2 = new ImageOptions.Builder()
                // 设置 config 每一个像素所占大小
                .setConfig(Bitmap.Config.RGB_565)
                //设置加载出错的图片
                //.setFailureDrawableId(R.mipmap.ic_launcher)
                // 设置加载过程中的图片
                //.setLoadingDrawableId(R.mipmap.ic_launcher)
                // 是否是圆形的
                .setCircular(true)
                // 设置是否使用内存缓存
                .setUseMemCache(true)
                // 设置是否渐入
                .setFadeIn(true)
                //设置是否忽略gif
                .setIgnoreGif(false).build();

        options3 = new ImageOptions.Builder().setUseMemCache(true).build();
    }

    public static ImageOptions getOptions() {
        return options;
    }

    public static void setOptions(ImageOptions options) {
        KKApp.options = options;
    }

    public static ImageOptions getOptions2() {
        return options2;
    }

    public static void setOptions2(ImageOptions options2) {
        KKApp.options2 = options2;
    }

    public static ImageOptions getOptions3() {
        return options3;
    }

    public static void setOptions3(ImageOptions options3) {
        KKApp.options3 = options3;
    }
}
