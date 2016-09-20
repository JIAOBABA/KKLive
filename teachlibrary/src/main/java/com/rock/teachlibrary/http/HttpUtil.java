package com.rock.teachlibrary.http;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Rock on 2016/8/15.
 */
public class HttpUtil {

    private static final int SUCCESS = 100;
    private static final int FAIL = 101;
    private static OkHttpClient mClient = new OkHttpClient();

    public static byte[] getBytes(String url){
        // 构建OkHttp的Request
        Request request = new Request.Builder()
                // 指定Request的URL
                .url(url)
                .build();
        try {
            Response response = mClient.newCall(request).execute();
            if (response.isSuccessful()) {
                // 如果请求成功，我们就返回字节数组
                return response.body().bytes();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getString(String url){
        // 构建OkHttp的Request
        Request request = new Request.Builder()
                // 指定Request的URL
                .url(url)
                .build();
        try {
            Response response = mClient.newCall(request).execute();
            if (response.isSuccessful()) {
                // 如果请求成功，我们就返回字节数组
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
public static void getStringAsync(final String URL,final RequestCallBack callBack){
    final Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case SUCCESS:
                    callBack.onSuccess((String) msg.obj);
                    break;
                case FAIL:
                    callBack.onFailure();
                    break;
            }
            callBack.onFinish();

        }
    };
    Thread thread=new Thread(){
        @Override
        public void run() {
            String result = getString(URL);
            if (result==null) {
                handler.sendEmptyMessage(FAIL);
                return;
            }
            Message msg=Message.obtain();
            msg.what=SUCCESS;
            msg.obj=result;
            handler.sendMessage(msg);

        }
    };
    thread.start();

    }
    public interface RequestCallBack{
        void onFailure();
        void onSuccess(String result);
        void onFinish();
    }
}
