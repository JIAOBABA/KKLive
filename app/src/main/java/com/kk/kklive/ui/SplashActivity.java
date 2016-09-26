package com.kk.kklive.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kk.kklive.R;

public class SplashActivity extends AppCompatActivity implements Handler.Callback{

    private static final int GO_MAIN = 100;
    private static final long DELAY_TIME = 2 * 1000;
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {
        mHandler = new Handler(this);
        mHandler.sendEmptyMessageDelayed(GO_MAIN,DELAY_TIME);

    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case GO_MAIN:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return false;
    }
}
