package com.kk.kklive.ui.directseeding;

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
import com.kk.kklive.adapters.RodLiveAdapter;
import com.kk.kklive.model.Recommend;
import com.kk.kklive.model.RodLive;
import com.kk.kklive.ui.live.LiveActivity;
import com.kk.kklive.views.PullToRefreshRecyclerView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

public class RodLiveActivity extends AppCompatActivity implements View.OnClickListener,PullToRefreshBase.OnRefreshListener2,Handler.Callback,RodLiveAdapter.OnItemClickListener {

    private static final long DELAY_TIME = 3 * 1000;
    private static final int ADD_RES = 200;
    private static final int UPDATE_RES = 100;
    private static final String TAG = RodLiveActivity.class.getSimpleName();
    private PullToRefreshRecyclerView mRefresh;
    private RecyclerView mRecyclerView;
    private RodLiveAdapter mAdapter;
    private Handler mHandler;
    private int page;
    public static final String START_URL = "http://www.kktv1.com/CDN/output/M/1/I/20010302/P/a-1_c-70036_cataId-438_start-";
    public static final String END_URL = "_offset-20_platform-2/json.js";
    private ImageView mImageView;
    private List<RodLive.RoomListBean> mRoomList;
    private List<RodLive.RoomListBean> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        initView();
    }

    enum State{
        DOWN,UP
    }

    private void setupView(final State state) {
        RequestParams params = new RequestParams(START_URL+page+END_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                RodLive rodLive = gson.fromJson(result, RodLive.class);
                switch (state) {
                    case DOWN:
                        mAdapter.updateRes(rodLive.getRoomList());
                        break;
                    case UP:
                        mAdapter.addRes(rodLive.getRoomList());
                        break;
                }
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
        mAdapter = new RodLiveAdapter(this,null);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setListener(this);
        setupView(State.DOWN);
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
                setupView(State.DOWN);
                mRefresh.onRefreshComplete();
                break;
            case ADD_RES:
                page = page+20;
                setupView(State.UP);
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
