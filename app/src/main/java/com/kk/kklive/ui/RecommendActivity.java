package com.kk.kklive.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;
import com.kk.kklive.adapters.RecommendAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.Recommend;
import com.kk.kklive.ui.live.LiveActivity;
import com.kk.kklive.views.PullToRefreshRecyclerView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

public class RecommendActivity extends AppCompatActivity implements PullToRefreshBase.OnRefreshListener2,Handler.Callback, RecommendAdapter.OnItemClickListener, View.OnClickListener {

    private static final String TAG = RecommendActivity.class.getSimpleName();
    private static final long DELAY_TIME = 3 * 1000;
    private static final int ADD_RES = 200;
    private static final int UPDATE_RES = 100;
    private PullToRefreshRecyclerView mRefresh;
    private RecyclerView mRecyclerView;
    private RecommendAdapter mAdapter;
    private Handler mHandler;
    private List<Recommend.RoomListBean> mRoomList;
    private int page;
    public static final String START_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":55000002,\"start\":";
    public static final String END_URL = ",\"offset\":14,\"platform\":2}";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        initView();
        setupView();
    }

    private void setupView() {
        RequestParams params = new RequestParams(START_URL+page+END_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {


            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Recommend recommend = gson.fromJson(result, Recommend.class);
                mRoomList = recommend.getRoomList();
                mAdapter.updateRes(mRoomList);
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

        mImageView = (ImageView) findViewById(R.id.recommend_back);
        mImageView.setOnClickListener(this);
        mRefresh = (PullToRefreshRecyclerView) findViewById(R.id.recommend_refresh);
        mRefresh.setMode(PullToRefreshBase.Mode.BOTH);
        mRefresh.setOnRefreshListener(this);

        // 获取Recycler
        mRecyclerView = mRefresh.getRefreshableView();
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecommendAdapter(this,null);
        mRecyclerView.setAdapter(mAdapter);
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
                page = 0;
                mAdapter.updateRes(mRoomList);
                mRefresh.onRefreshComplete();
                break;
            case ADD_RES:
                page++;
                page = 20*page;
                mAdapter.addRes(mRoomList);
                mRefresh.onRefreshComplete();
                break;
        }
        return false;
    }

    @Override
    public void onItemClick(int position) {
        String liveStream = mRoomList.get(position).getLiveStream();
        Intent intent = new Intent(this, LiveActivity.class);
        intent.putExtra("path",liveStream);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
