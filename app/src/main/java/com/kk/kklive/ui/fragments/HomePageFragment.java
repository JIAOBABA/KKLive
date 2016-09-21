package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.kklive.R;
import com.kk.kklive.adapters.HomePageRecommendAdapter;
import com.kk.kklive.model.Recommend;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页碎片
 * Created by fei on 2016/9/20.
 */
public class HomePageFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_home_page,container,false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        initView();
    }

//    private void initView() {
//        mRecyclerView = (RecyclerView) layout.findViewById(R.id.home_page_recommend_recycler);
//        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setAdapter(new HomePageRecommendAdapter(getActivity(),getData()));
//
//    }
//
//    private List<Recommend.RoomListBean> getData() {
//        List<Recommend.RoomListBean> data = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            Recommend.RoomListBean bean = new Recommend.RoomListBean();
//            bean.setNickname("主播"+i);
//            bean.setOnlineCount(12543);
//            data.add(bean);
//        }
//        return data;
//    }
}
