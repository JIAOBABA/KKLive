package com.kk.kklive.ui.directseeding.fragments;

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
import com.kk.kklive.adapters.HomePageCityAnchorFooterAdapter;
import com.kk.kklive.adapters.HomePageRecommendHeaderAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.CityAnchor;
import com.kk.kklive.model.DirectSeedingAdvertisement;
import com.kk.kklive.model.Recommend;
import com.kk.kklive.model.StarWars;
import com.kk.kklive.ui.fragments.BaseFragment;
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
public class HomePageFragment extends BaseFragment implements OnBannerClickListener, HomePageRecommendHeaderAdapter.OnItemClickListener, HomePageCityAnchorFooterAdapter.OnItemClickListener {

    private StickyListHeadersListView mStickyListHeadersListView;
    private StickyListView mHeadersListView;
    private HomePageRecommendHeaderAdapter mHeaderAdapter;
    private HomePageAdapter mAdapter;
    private Banner mBanner;
    private List<Recommend.RoomListBean> mRoomList;
    private StickyListView mFooterListView;
    private HomePageCityAnchorFooterAdapter mFooterAdapter;
    private List<CityAnchor.ActorNearbyBean> mActorNearby;

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
        RequestParams params2 = new RequestParams(HttpConstant.ADVERTISEMENT_URL);
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
        RequestParams params = new RequestParams(HttpConstant.HOME_PAGE_RECOMMEND_URL);
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
        RequestParams params1 = new RequestParams(HttpConstant.STAR_WARS_URL);
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

        // 同城主播解析
        RequestParams params3 = new RequestParams(HttpConstant.CITY_ANCHOR_URL);
        x.http().get(params3, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                CityAnchor cityAnchor = gson.fromJson(result, CityAnchor.class);
                mActorNearby = cityAnchor.getActorNearby();
                mFooterAdapter.updateRes(mActorNearby);
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
        // 初始化脚布局
        View footerView = getActivity().getLayoutInflater().inflate(R.layout.fragment_home_page_footer, null);
        mFooterListView = ((StickyListView) footerView.findViewById(R.id.home_page_footer_sticky_list));
        mFooterAdapter = new HomePageCityAnchorFooterAdapter(getActivity(),null);
        mFooterListView.setAdapter(mFooterAdapter);
        mFooterAdapter.setListener(this);

        // 添加脚布局
        mStickyListHeadersListView.addFooterView(footerView);
        mAdapter = new HomePageAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
    }

    // 图片监听
    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getActivity(), "图片被点击"+position, Toast.LENGTH_SHORT).show();
    }

    // 推荐列表监听
    @Override
    public void onItemClick(int position) {
        String liveStream = mRoomList.get(position).getLiveStream();
        Intent intent = new Intent(getActivity(), LiveActivity.class);
        intent.putExtra("path",liveStream);
        startActivity(intent);
    }

    // 同城主播列表监听
    @Override
    public void onFooterItemClick(int position) {
        String liveStream = mActorNearby.get(position).getLiveStream();
        Intent intent = new Intent(getActivity(), LiveActivity.class);
        intent.putExtra("path",liveStream);
        startActivity(intent);
    }
}
