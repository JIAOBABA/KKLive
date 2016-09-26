package com.kk.kklive.ui.directseeding.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HotAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.DirectSeedingAdvertisement;
import com.kk.kklive.model.Hot;
import com.kk.kklive.ui.fragments.BaseFragment;
import com.kk.kklive.ui.live.LiveActivity;
import com.kk.kklive.views.PullToRefreshStickyListHeadersListView;
import com.qf.bannder.Banner;
import com.qf.bannder.BannerConfig;
import com.qf.bannder.listener.OnBannerClickListener;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * 热门碎片
 * Created by fei on 2016/9/20.
 */
public class HotFragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2,Handler.Callback, HotAdapter.OnItemClickListener, OnBannerClickListener, RadioGroup.OnCheckedChangeListener {

    private static final int UPDATE_RES = 100;
    private static final long DELAY_TIME = 3 * 1000;
    private static final int ADD_RES = 200;
    private PullToRefreshStickyListHeadersListView mRefresh;
    private StickyListHeadersListView mStickyListHeadersListView;
    private Handler mHandler;
    private HotAdapter mAdapter;

    private DirectSeedingAdvertisement directSeedingAdvertisement;
    private Hot hot;
    private Banner mBanner;
    private PopupWindow mPopupWindow;
    private TextView mText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_hot,container,false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        setupView();
    }

    private void setupView() {

        // 广告网址
        RequestParams params1 = new RequestParams(HttpConstant.ADVERTISEMENT_URL);
        x.http().get(params1, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                directSeedingAdvertisement = gson.fromJson(result, DirectSeedingAdvertisement.class);
                List<DirectSeedingAdvertisement.ActivityListBean> activityList = directSeedingAdvertisement.getActivityList();
                List<String> data = new ArrayList<>();
                for (int i = 0; i <activityList.size() ; i++) {
                    String topMobileURL = activityList.get(i).getTopMobileURL();
                    data.add(topMobileURL);
                }
                mBanner.setImages(data);
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
        // 正在直播网址
        goHttp(HttpConstant.POPULAR_ANCHOR_URL);
    }

    private void initView() {
        mHandler = new Handler(this);

        mRefresh = (PullToRefreshStickyListHeadersListView) layout.findViewById(R.id.pull_sticky_list);
        mRefresh.setMode(PullToRefreshBase.Mode.BOTH);
        mRefresh.setOnRefreshListener(this);

        // 获取StickyListHeadersListView
        mStickyListHeadersListView = mRefresh.getRefreshableView();
        // 初始化头布局
        View mHeaderView = getActivity().getLayoutInflater().inflate(R.layout.item_hot_header, null);
        mBanner = ((Banner) mHeaderView.findViewById(R.id.item_hot_header_banner));
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        mBanner.setIndicatorGravity(BannerConfig.RIGHT);
        mBanner.setDelayTime(5 * 1000);
        mBanner.setOnBannerClickListener(this);

        // 添加头布局
        mStickyListHeadersListView.addHeaderView(mHeaderView);

        mAdapter = new HotAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
        mAdapter.setListener(this);
    }

    /**
     * 下拉刷新
     * @param refreshView
     */
    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        mHandler.sendEmptyMessageDelayed(UPDATE_RES,DELAY_TIME);
    }

    /**
     * 上拉加载
     * @param refreshView
     */
    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        mHandler.sendEmptyMessageDelayed(ADD_RES,DELAY_TIME);
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case UPDATE_RES:
                mRefresh.onRefreshComplete();
                break;
            case ADD_RES:
                mRefresh.onRefreshComplete();
                break;
        }
        return false;
    }

    @Override
    public void onHeaderItemClick(View view) {
        View pop = LayoutInflater.from(getActivity()).inflate(R.layout.hot_pop, null);
        mText = ((TextView) view);

        RadioGroup radioGroup = (RadioGroup) pop.findViewById(R.id.hot_pop_radio_group);
        radioGroup.setOnCheckedChangeListener(this);
        int x = (int) view.getX();
        int y = (int) view.getY();

        if (mPopupWindow == null) {
            this.mPopupWindow = new PopupWindow(pop);
            mPopupWindow.setWidth(getResources().getDisplayMetrics().widthPixels/4);
            mPopupWindow.setHeight(getResources().getDisplayMetrics().heightPixels/5);
//            mPopupWindow.showAsDropDown(view, 0,0);

        }
        if (mPopupWindow.isShowing()) {
            // 如果显示状态 就隐藏
            mPopupWindow.dismiss();
        }else {
//             以一个View为基准点，在他的下方去显示
           mPopupWindow.showAsDropDown(view, 0,0);
            // 显示在指定位置
           // mPopupWindow.showAtLocation(view, Gravity.TOP/Gravity.LEFT,0,0);
            pop.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (mPopupWindow!=null&&mPopupWindow.isShowing()) {
                        mPopupWindow.dismiss();
                        mPopupWindow = null;
                    }
                    return false;
                }
            });
        }
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();
        String liveStream = hot.getRoomList().get(position).getLiveStream();
        Intent intent = new Intent(getActivity(), LiveActivity.class);
        intent.putExtra("path",liveStream);
        startActivity(intent);

    }

    // 头布局监听事件
    @Override
    public void OnBannerClick(int position) {
       // Toast.makeText(getActivity(), "图片被点击"+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.hot_pop_popular_anchor:
                goHttp(HttpConstant.POPULAR_ANCHOR_URL);
                mText.setText("人气主播");
                if (mPopupWindow!=null&&mPopupWindow.isShowing()) {
                    mPopupWindow.dismiss();
                    mPopupWindow = null;
                }
                break;
            case R.id.hot_pop_star_rating:
                goHttp(HttpConstant.STAR_RATING_URL);
                mText.setText("明星等级");
                if (mPopupWindow!=null&&mPopupWindow.isShowing()) {
                    mPopupWindow.dismiss();
                    mPopupWindow = null;
                }
                break;
            case R.id.hot_pop_recently_launched:
                goHttp(HttpConstant.RECENTLY_LAUNCHED_URL);
                mText.setText("最近开播");
                if (mPopupWindow!=null&&mPopupWindow.isShowing()) {
                    mPopupWindow.dismiss();
                    mPopupWindow = null;
                }
                break;
        }
    }

    private void goHttp(String s) {
        RequestParams params = new RequestParams(s);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                hot = gson.fromJson(result, Hot.class);
                mAdapter.updateRes(hot.getRoomList());
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
}
