package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HotAdapter;
import com.kk.kklive.model.Hot;
import com.kk.kklive.views.PullToRefreshStickyListHeadersListView;

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
public class HotFragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2,Handler.Callback {

    private static final int UPDATE_RES = 100;
    private static final long DELAY_TIME = 3 * 1000;
    private static final int ADD_RES = 200;
    private static final String POPULARANCHOR_URL = "http://www.kktv1.com/CDN/output/M/1/I/55000003/P/a-1_c-70036_start-0_offset-20_platform-2_type-2/json.js";
    private PullToRefreshStickyListHeadersListView mRefresh;
    private StickyListHeadersListView mStickyListHeadersListView;

    private Handler mHandler;
    private HotAdapter mAdapter;

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
        RequestParams params = new RequestParams(POPULARANCHOR_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Hot hot = gson.fromJson(result, Hot.class);
                List<Hot.RoomListBean> roomList = hot.getRoomList();
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
        mHandler = new Handler(this);

        mRefresh = (PullToRefreshStickyListHeadersListView) layout.findViewById(R.id.pull_sticky_list);
        mRefresh.setMode(PullToRefreshBase.Mode.BOTH);
        mRefresh.setOnRefreshListener(this);

        // 获取StickyListHeadersListView
        mStickyListHeadersListView = mRefresh.getRefreshableView();
        mAdapter = new HotAdapter(getActivity(),null);
        mStickyListHeadersListView.setAdapter(mAdapter);
    }

    private List<Hot.RoomListBean> getData() {
        List<Hot.RoomListBean> data = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Hot.RoomListBean bean = new Hot.RoomListBean();
            bean.setNickname("沧海一声笑"+i);
            data.add(bean);
        }
        return data;
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
                mAdapter.updateRes(getData());
                mRefresh.onRefreshComplete();
                break;
            case ADD_RES:
                mAdapter.addRes(getData());
                mRefresh.onRefreshComplete();
                break;
        }
        return false;
    }
}
