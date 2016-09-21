package com.kk.kklive.ui.mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kk.kklive.R;
import com.kk.kklive.event.NickNameEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Set;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

public class LoadingActivity extends AppCompatActivity implements View.OnClickListener, PlatformActionListener {

    private Button mSMSCode;
    private ImageView mClose;
    private Button mCommit;
    private ImageView mQQ;
    private ImageView mWeiXin;
    private ImageView mSina;
    private ImageView mALi;

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

        mQQ = (ImageView) findViewById(R.id.login_qq);
        mQQ.setOnClickListener(this);
        mWeiXin = (ImageView) findViewById(R.id.login_weixin);
        mWeiXin.setOnClickListener(this);
        mSina = (ImageView) findViewById(R.id.login_weibo);
        mSina.setOnClickListener(this);
        mALi = (ImageView) findViewById(R.id.login_alipay);
        mALi.setOnClickListener(this);
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
            case R.id.login_qq:
                goLoading(QQ.NAME);
                break;
            case R.id.login_weixin:
                goLoading(Wechat.NAME);
                break;
            case R.id.login_weibo:
                goLoading(SinaWeibo.NAME);
                break;
            case R.id.login_alipay:
                goLoading(QQ.NAME);
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

    public void goLoading(String name){
        ShareSDK.initSDK(this);
        Platform weibo = ShareSDK.getPlatform(this,name);
        weibo.setPlatformActionListener(this);
        weibo.authorize();//单独授权
        weibo.showUser(null);//授权并获取用户信息
        //authorize与showUser单独调用一个即可
        //移除授权
        //weibo.removeAccount(true);
    }

    @Override
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        Set<String> keySet = hashMap.keySet();
        Object nickname = hashMap.get("nickname");
        Object figureurl2 = hashMap.get("figureurl_2");
        NickNameEvent event = new NickNameEvent(1000);
        event.setNickname(nickname);
        event.setNickname(figureurl2);
        EventBus.getDefault().post(event);
    }

    @Override
    public void onError(Platform platform, int i, Throwable throwable) {

    }

    @Override
    public void onCancel(Platform platform, int i) {

    }

}
