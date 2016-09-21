package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.ChannelAdapter;
import com.kk.kklive.model.Channel;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * 频道碎片
 * Created by fei on 2016/9/20.
 */
public class ChannelFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    private static final String CHANNEL_URL = "http://www.kktv1.com/CDN/output/M/1/I/55000004/P/a-1_c-70036_platform-2/json.js";
    private SwipeRefreshLayout mRefreshLayout;
    private StickyListHeadersListView mStickyListHeadersListView;
    private ChannelAdapter mAdapter;

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
        RequestParams params = new RequestParams(CHANNEL_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Channel channel = gson.fromJson(result, Channel.class);
                List<Channel.PlateListBean> plateList = channel.getPlateList();
                mAdapter.updateRes(plateList);
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
        mRefreshLayout = ((SwipeRefreshLayout) layout.findViewById(R.id.channel_refresh_layout));
        mRefreshLayout.setOnRefreshListener(this);
        mStickyListHeadersListView = ((StickyListHeadersListView) layout.findViewById(R.id.channel_sticky_list));
        mAdapter = new ChannelAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
    }

    private List<Channel.PlateListBean> getData() {
        List<Channel.PlateListBean> data = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Channel.PlateListBean bean = new Channel.PlateListBean();
            bean.setTitle("日了狗了 +"+i);
            List<Channel.PlateListBean.ResultBean> result = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                Channel.PlateListBean.ResultBean resultBean = new Channel.PlateListBean.ResultBean();
                resultBean.setNickname("主播"+j);
                resultBean.setOnlineCount(10*j);
                result.add(resultBean);
            }
            bean.setResult(result);
            data.add(bean);
        }
        return data;
    }

    // 下拉刷新的监听
    @Override
    public void onRefresh() {

    }
}
