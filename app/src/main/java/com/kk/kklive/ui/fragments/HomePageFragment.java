package com.kk.kklive.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HomePageAdapter;
import com.kk.kklive.adapters.HomePageRecommendHeaderAdapter;
import com.kk.kklive.model.DirectSeedingAdvertisement;
import com.kk.kklive.model.Recommend;
import com.kk.kklive.model.StarWars;
import com.kk.kklive.ui.live.LiveActivity;
import com.kk.kklive.views.StickyListView;
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
 * 首页碎片
 * Created by fei on 2016/9/20.
 */
public class HomePageFragment extends BaseFragment implements OnBannerClickListener, HomePageRecommendHeaderAdapter.OnItemClickListener {

    private static final String HOMEPAGERECOMMEND_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":55000002,\"start\":0,\"offset\":14,\"platform\":2}";
    private static final String STARWARS_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":10002011,\"platform\":2,\"userId\":112731886}";
    private StickyListHeadersListView mStickyListHeadersListView;
    private StickyListView mHeadersListView;
    private HomePageRecommendHeaderAdapter mHeaderAdapter;
    private HomePageAdapter mAdapter;
    private Banner mBanner;
    private List<Recommend.RoomListBean> mRoomList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_home_page,container,false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        setupView();
    }

    private void setupView() {
        // 广告解析
        RequestParams params2 = new RequestParams("http://www.kktv1.com/CDN/output/M/1440/I/10002006/P/a-1_c-70036_platform-2_isTop-1_version-79/json.js");
        x.http().get(params2, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                DirectSeedingAdvertisement directSeedingAdvertisement = gson.fromJson(result, DirectSeedingAdvertisement.class);
                List<DirectSeedingAdvertisement.HotActivityListBean> hotActivityList = directSeedingAdvertisement.getHotActivityList();
                List<String> url = new ArrayList<>();
                for (int i = 0; i < hotActivityList.size(); i++) {
                    String topMobileURL = hotActivityList.get(i).getTopMobileURL();
                    url.add(topMobileURL);
                }
                mBanner.setImages(url);
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

        // 推荐解析
        RequestParams params = new RequestParams(HOMEPAGERECOMMEND_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Recommend recommend = gson.fromJson(result, Recommend.class);
                mRoomList = recommend.getRoomList();
                mHeaderAdapter.updateRes(mRoomList);
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

        // 周星争夺战解析
        RequestParams params1 = new RequestParams(STARWARS_URL);
        x.http().get(params1, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                StarWars starWars = gson.fromJson(result, StarWars.class);
                List<StarWars.RankListBean> rankList = starWars.getRankList();
                mAdapter.updateRes(rankList);
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

    private void initView() {
        mStickyListHeadersListView = (StickyListHeadersListView) layout.findViewById(R.id.home_page_sticky_list);
        // 初始化头布局
        View headerView = getActivity().getLayoutInflater().inflate(R.layout.fragment_home_page_header, null);
        // 初始化推荐listView
        mHeadersListView = ((StickyListView) headerView.findViewById(R.id.home_page_header_sticky_list));
        mHeaderAdapter = new HomePageRecommendHeaderAdapter(getActivity(),null);
        mHeadersListView.setAdapter(mHeaderAdapter);
        mHeaderAdapter.setListener(this);
        // 初始化banner
        mBanner = ((Banner) headerView.findViewById(R.id.home_page_header_banner));
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        mBanner.setIndicatorGravity(BannerConfig.RIGHT);
        mBanner.setDelayTime(5 * 1000);
        mBanner.setOnBannerClickListener(this);
        // 添加头布局
        mStickyListHeadersListView.addHeaderView(headerView);

        mAdapter = new HomePageAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
    }

    // 图片监听
    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getActivity(), "被点击"+position, Toast.LENGTH_SHORT).show();
    }

    // 推荐列表的监听
    @Override
    public void onItemClick(int position) {
        String liveStream = mRoomList.get(position).getLiveStream();
        Intent intent = new Intent(getActivity(), LiveActivity.class);
        intent.putExtra("path",liveStream);
        startActivity(intent);
    }
}
