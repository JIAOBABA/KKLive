package com.kk.kklive.ui.mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kk.kklive.R;

import java.util.HashMap;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

public class LoadingActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSMSCode;
    private ImageView mClose;
    private Button mCommit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        initView();
    }
    private void initView() {
        mClose = (ImageView) findViewById(R.id.login_close);
        mClose.setOnClickListener(this);
        mSMSCode = (Button) findViewById(R.id.login_btn_code);
        mSMSCode.setOnClickListener(this);
        mCommit = (Button) findViewById(R.id.login_btn_logining);
        mCommit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_close:
                finish();
                break;
            case R.id.login_btn_code:
                //发送短信
                goSMS();
                break;
            case R.id.login_btn_logining:
                Intent intent = new Intent(this, SettingActivity.class);
                startActivity(intent);
                break;
        }
    }
    private void goSMS() {
        //打开注册页面
        RegisterPage registerPage = new RegisterPage();
        registerPage.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                // 解析注册结果
                if (result == SMSSDK.RESULT_COMPLETE) {
                    @SuppressWarnings("unchecked")
                    HashMap<String,Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country");
                    String phone = (String) phoneMap.get("phone");

//        // 提交用户信息（此方法可以不调用）
//                    registerUser(country, phone);

                }
            }
        });
        registerPage.show(this);
    }
}
