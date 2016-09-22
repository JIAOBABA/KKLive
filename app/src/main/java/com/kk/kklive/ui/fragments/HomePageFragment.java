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

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * 首页碎片
 * Created by fei on 2016/9/20.
 */
public class HomePageFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private StickyListHeadersListView mStickyListHeadersListView;

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
    }

    private void initView() {
        mStickyListHeadersListView = (StickyListHeadersListView) layout.findViewById(R.id.home_page_sticky_list);

    }

}
