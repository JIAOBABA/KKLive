package com.kk.kklive.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.OneMineAdapter;
import com.kk.kklive.event.NickNameEvent;
import com.kk.kklive.minemodel.RoomLists;
import com.kk.kklive.ui.mine.FourMineFragment;
import com.kk.kklive.ui.mine.HomeActivity;
import com.kk.kklive.ui.mine.LoadingActivity;
import com.kk.kklive.ui.mine.OneMineFragment;
import com.kk.kklive.ui.mine.SettingActivity;
import com.kk.kklive.ui.mine.ThreeMineFragment;
import com.kk.kklive.ui.mine.TwoMineFragment;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.lang.reflect.InvocationTargetException;

/**
 * 我的碎片
 * Created by fei on 2016/9/20.
 */
public class MineFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener, View.OnClickListener,Handler.Callback {

    public static final String TAG = MineFragment.class.getSimpleName();

    public static final String ImageAttention_URL=
            "http://api.kktv1.com:8080/meShow/entrance?parameter={platform:2,count:5,c:216,FuncTag:10002003,userId:111610576,a:1}";


    private RadioGroup mRadioGroup;
    private ImageView mImageHelp;
    private ImageView mImageSetting;
    private ImageView mImageLogin;
    private TextView mTextLogin;
    private LinearLayout mLayoutFamily;
    private TextView mPayMoney;
    private Fragment mOneMineFragment;
    private TextView mShop;
    private TextView mTask;
    private ListView mListView;
    private OneMineAdapter mAdapter;
    private TextView mBi;


    private Handler mHandler=new Handler(this);
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_mine,container,false);
        initView();
        return layout;
    }

    private void initView() {

        mImageHelp = ((ImageView) layout.findViewById(R.id.mine_help));
        mImageHelp.setOnClickListener(this);
        mImageSetting = ((ImageView) layout.findViewById(R.id.mine_setting));
        mImageSetting.setOnClickListener(this);
        mImageLogin = ((ImageView) layout.findViewById(R.id.mine_image_loginOrZhuce));
        mImageLogin.setOnClickListener(this);
        mTextLogin = ((TextView) layout.findViewById(R.id.mine_txt_loginOrZhuce));
        mTextLogin.setOnClickListener(this);
        mLayoutFamily = ((LinearLayout) layout.findViewById(R.id.mine_family));
        mLayoutFamily.setOnClickListener(this);
        mPayMoney = ((TextView) layout.findViewById(R.id.mine_pay_money));
        mPayMoney.setOnClickListener(this);
        mShop = ((TextView) layout.findViewById(R.id.mine_shop));
        mShop.setOnClickListener(this);
        mTask = ((TextView) layout.findViewById(R.id.mine_task));
        mTask.setOnClickListener(this);
        mBi = ((TextView) layout.findViewById(R.id.mine_bin));
        mBi.setOnClickListener(this);
        mBi.setAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.bi_anim));
        mHandler.sendEmptyMessageDelayed(100,1000);

        mRadioGroup = ((RadioGroup) layout.findViewById(R.id.mine_rg));
        mRadioGroup.setOnCheckedChangeListener(this);
//        FragmentManager fm = getChildFragmentManager();
//        FragmentTransaction transaction = fm.beginTransaction();
//        mOneMineFragment = new OneMineFragment();
//        transaction.add(R.id.main_container, mOneMineFragment,OneMineFragment.TAG);
//        transaction.commit();
        mListView = (ListView) layout.findViewById(R.id.ListView);
        mAdapter = new OneMineAdapter(getContext(),null,R.layout.one_mine_item);
        mListView.setAdapter(mAdapter);
        setData();

    }

    private void setData() {
        RequestParams params = new RequestParams(ImageAttention_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                RoomLists roomLists = gson.fromJson(result, RoomLists.class);
                mAdapter.update(roomLists.getRoomList());
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.mine_rb_one:
//                switchPages(OneMineFragment.TAG, OneMineFragment.class);
                break;
            case R.id.mine_rb_two:
//                switchPages(TwoMineFragment.TAG, TwoMineFragment.class);
                break;
            case R.id.mine_rb_three:
//                switchPages(ThreeMineFragment.TAG, ThreeMineFragment.class);
                break;
            case R.id.mine_rb_four:
//                switchPages(FourMineFragment.TAG, FourMineFragment.class);
                break;
        }
    }
    public void switchPages(String tag,Class<? extends Fragment> cls){
        FragmentManager fm = getChildFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.hide(mOneMineFragment);
        mOneMineFragment =  fm.findFragmentByTag(tag);
        if (mOneMineFragment != null) {
            transaction.show(mOneMineFragment);
        }else {
            try {
                mOneMineFragment =  cls.getConstructor().newInstance();
            } catch (java.lang.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            transaction.add(R.id.main_container,mOneMineFragment,tag);
        }
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mine_help:
                //跳转到帮助中心界面

                break;
            case R.id.mine_setting:
                Toast.makeText(getActivity(), "设置按钮", Toast.LENGTH_SHORT).show();
                //跳转到设置界面
                goActivity(SettingActivity.class);
                break;
            case R.id.mine_image_loginOrZhuce:
                //跳转到注册或登录
                    if (mTextLogin.getText().equals("登录/注册")) {
                        goActivity(LoadingActivity.class);
                    }
                break;
            case R.id.mine_txt_loginOrZhuce:
                //跳转到注册或登录或其他

                    if (mTextLogin.getText().equals("登录/注册")) {
                        goActivity(LoadingActivity.class);
                    }

                break;
            case R.id.mine_family:
                //跳转到家族界面
                goActivity(HomeActivity.class);
                break;
            case R.id.mine_pay_money:
                //跳转到注册或登录或其他

                    if (mTextLogin.getText().equals("登录/注册")) {
                        goActivity(LoadingActivity.class);
                    }

                break;
            case R.id.mine_shop:
                //跳转到webView
                break;
            case R.id.mine_task:
                //跳转到做任务界面
                break;
            case R.id.mine_bin:
                //跳转到金币
                break;
        }
    }
    public void goActivity(Class cls){
        Intent intent = new Intent(getActivity(), cls);
        startActivity(intent);
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case 100:
                mHandler.sendEmptyMessageDelayed(100,3000);
                break;
        }
        return false;
    }
    @Override
    public void onResume() {
        super.onResume();
        // 注册
        EventBus.getDefault().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        // 取消注册
        EventBus.getDefault().unregister(this);
    }
    @Subscribe
    public void onEvent(NickNameEvent event){
        mTextLogin.setText(event.getNickname().toString());
        Picasso.with(getContext()).load(event.getFigureurl_2().toString()).into(mImageLogin);

    }
}
