package com.kk.kklive.ui.directseeding.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.ChannelAdapter;
import com.kk.kklive.adapters.ChannelHeaderAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.Channel;
import com.kk.kklive.ui.directseeding.RodLiveActivity;
import com.kk.kklive.ui.fragments.BaseFragment;
import com.kk.kklive.ui.live.LiveActivity;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * 频道碎片
 * Created by fei on 2016/9/20.
 */
public class ChannelFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener,Handler.Callback, ChannelAdapter.OnItemClickListener, ChannelHeaderAdapter.OnItemClickListener {

    private static final int UPDATE = 100;
    private static final long DELAYED_TIME = 3 * 1000;
    private SwipeRefreshLayout mRefreshLayout;
    private StickyListHeadersListView mStickyListHeadersListView;
    private ChannelAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ChannelHeaderAdapter mHeaderAdapter;
    private Handler mHandler;
    private List<Channel.PlateListBean> mPlateList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_channel,container,false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        setupView();
    }

    private void setupView() {
        RequestParams params = new RequestParams(HttpConstant.CHANNEL_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {


            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Channel channel = gson.fromJson(result, Channel.class);
                mPlateList = channel.getPlateList();
                mHeaderAdapter.updateRes(mPlateList);

                for (int i = 0; i < mPlateList.size(); i++) {
                    List<Channel.PlateListBean.ResultBean> result1 = mPlateList.get(i).getResult();
                    if (result1.size()<4) {
                        mPlateList.remove(i);
                        i--;
                    }
                }
                mAdapter.updateRes(mPlateList);
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
        // 初始化Handler
        mHandler = new Handler(this);
        // 初始化刷新View
        mRefreshLayout = ((SwipeRefreshLayout) layout.findViewById(R.id.channel_refresh_layout));
        mRefreshLayout.setOnRefreshListener(this);
        // 初始化StickyListHeadersListView
        mStickyListHeadersListView = ((StickyListHeadersListView) layout.findViewById(R.id.channel_sticky_list));
        // 初始化头布局
        View mHeaderView = getActivity().getLayoutInflater().inflate(R.layout.fragment_channel_header,null);
        mRecyclerView = ((RecyclerView) mHeaderView.findViewById(R.id.item_channel_header_recycler));
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 5);
        mRecyclerView.setLayoutManager(layoutManager);
        mHeaderAdapter = new ChannelHeaderAdapter(getActivity(),null);
        mRecyclerView.setAdapter(mHeaderAdapter);
        mHeaderAdapter.setListener(this);
        // 绑定头布局
        mStickyListHeadersListView.addHeaderView(mHeaderView);
        // 绑定脚布局
        mStickyListHeadersListView.addFooterView(getActivity().getLayoutInflater().inflate(R.layout.item_channel_footer,null));

        mAdapter = new ChannelAdapter(getActivity(),null);
        // 绑定适配器
        mStickyListHeadersListView.setAdapter(mAdapter);
        // 设置监听
        mAdapter.setListener(this);
    }

    // 下拉刷新的监听
    @Override
    public void onRefresh() {
        mHandler.sendEmptyMessageDelayed(UPDATE,DELAYED_TIME);
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case UPDATE:
                mAdapter.updateRes(mPlateList);
                mRefreshLayout.setRefreshing(false);
                break;
        }
        return false;
    }

    @Override
    public void onItemClick(int position,View v) {
        switch (v.getId()) {
            case R.id.item_channel_sticky_image:
            case R.id.item_channel_sticky_image2:
            case R.id.item_channel_sticky_image3:
            case R.id.item_channel_sticky_image4:
                String liveStream = mPlateList.get(position / 4).getResult().get(position % 4).getLiveStream();
                Intent intent = new Intent(getActivity(), LiveActivity.class);
                intent.putExtra("path",liveStream);
                startActivity(intent);
                break;
            case R.id.item_channel_header_icon:
                switch (position) {
                    case 0:
                        goActivity(RodLiveActivity.class);
                        break;
                }
                break;
        }

    }

    public void goActivity(Class cls){
        Intent intent = new Intent(getActivity(), cls);
        startActivity(intent);
    }
}
