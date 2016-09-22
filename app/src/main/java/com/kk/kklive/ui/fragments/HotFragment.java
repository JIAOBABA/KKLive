package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HotAdapter;
import com.kk.kklive.adapters.HotHeaderAdapter;
import com.kk.kklive.adapters.HotHeaderFragmentAdapter;
import com.kk.kklive.model.DirectSeedingAdvertisement;
import com.kk.kklive.model.Hot;
import com.kk.kklive.views.PullToRefreshStickyListHeadersListView;
import com.rock.teachlibrary.http.HttpUtil;

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
public class HotFragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2,Handler.Callback, HotAdapter.OnItemClickListener {

    private static final int UPDATE_RES = 100;
    private static final long DELAY_TIME = 3 * 1000;
    private static final int ADD_RES = 200;
    private static final String POPULAR_ANCHOR_URL = "http://www.kktv1.com/CDN/output/M/1/I/55000003/P/a-1_c-70036_start-0_offset-20_platform-2_type-2/json.js";
    private static final String ADVERTISEMENT_URL = "http://www.kktv1.com/CDN/output/M/1440/I/10002006/P/a-1_c-70036_platform-2_isTop-1_version-79/json.js";
    private static final String TAG = HotFragment.class.getSimpleName();
    private static final int CAROUSEL = 300;
    private PullToRefreshStickyListHeadersListView mRefresh;
    private StickyListHeadersListView mStickyListHeadersListView;

    private Handler mHandler;
    private HotAdapter mAdapter;
    private List<String> url;
    private ViewPager mViewPager;
    private HotHeaderFragmentAdapter mHotHeaderFragmentAdapter;

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

        HttpUtil.getStringAsync(ADVERTISEMENT_URL, new HttpUtil.RequestCallBack() {
            @Override
            public void onFailure() {

            }

            @Override
            public void onSuccess(String result) {

                Gson gson = new Gson();
                DirectSeedingAdvertisement directSeedingAdvertisement = gson.fromJson(result, DirectSeedingAdvertisement.class);
                List<DirectSeedingAdvertisement.ActivityListBean> activityList = directSeedingAdvertisement.getActivityList();
                List<Fragment> data = new ArrayList<>();
                for (int i = 0; i < activityList.size(); i++) {
                    HotHeaderFragment fragment = new HotHeaderFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("text",activityList.get(i).getTopMobileURL());
                    fragment.setArguments(bundle);
                    data.add(fragment);
                }
                mHotHeaderFragmentAdapter.upDateRes(data,activityList);
                mViewPager.setCurrentItem(100);
            }

            @Override
            public void onFinish() {

            }
        });

        RequestParams params = new RequestParams(POPULAR_ANCHOR_URL);
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
        // 初始化头布局
        View mHeaderView = getActivity().getLayoutInflater().inflate(R.layout.item_hot_header, null);
        mViewPager = ((ViewPager) mHeaderView.findViewById(R.id.item_hot_header_viewpager));
        mHotHeaderFragmentAdapter = new HotHeaderFragmentAdapter(getChildFragmentManager(),null);
        mViewPager.setAdapter(mHotHeaderFragmentAdapter);
        mHandler.sendEmptyMessageDelayed(CAROUSEL,DELAY_TIME);

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
            case CAROUSEL:
                int currentItem = mViewPager.getCurrentItem();
                mViewPager.setCurrentItem(currentItem+1);
                mHandler.sendEmptyMessageDelayed(CAROUSEL,DELAY_TIME);
                break;
        }
        return false;
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getActivity(), "被点击了"+position, Toast.LENGTH_SHORT).show();
    }
}
