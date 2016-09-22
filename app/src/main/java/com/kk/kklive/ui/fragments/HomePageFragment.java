package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HomePageRecommendAdapter;
import com.kk.kklive.model.Recommend;

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
public class HomePageFragment extends BaseFragment {

    private static final String HOMEPAGERECOMMEND_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":55000002,\"start\":0,\"offset\":14,\"platform\":2}";
    private StickyListHeadersListView mStickyListHeadersListView;
    private HomePageRecommendAdapter mAdapter;

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
        RequestParams params = new RequestParams(HOMEPAGERECOMMEND_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Recommend recommend = gson.fromJson(result, Recommend.class);
                List<Recommend.RoomListBean> roomList = recommend.getRoomList();
                mAdapter.updateRes(roomList);
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
        mAdapter = new HomePageRecommendAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
    }

}
