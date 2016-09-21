package com.kk.kklive;

import android.app.Application;

import com.rock.teachlibrary.ImageLoader;

import org.xutils.x;

import cn.smssdk.SMSSDK;

/**
 * Created by fei on 2016/9/20.
 */
public class KKApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化xutils
        x.Ext.init(this);
        x.Ext.setDebug(true);
        // 初始化teachlibrary
        ImageLoader.init(this);

        SMSSDK.initSDK(this, "174b5e51bb113", "2b545c3e2261c6eb50fa783a30475869");
    }
}
