package com.kk.kklive.ui.news;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kk.kklive.R;
import com.kk.kklive.adapters.NewsAdapter;
import com.kk.kklive.newsmodel.MessageList;
import com.kk.kklive.newsmodel.MessageLists;
import com.kk.kklive.ui.BaseActivity;
import com.kk.kklive.ui.mine.SettingActivity;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class NewsSecondActivity extends BaseActivity implements View.OnClickListener {

    public static final String NewsSecond_URL=
            "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":221,\"FuncTag\":50006104,\"userId\":112742652,\"token\":\"A13AD3BF7D682D1414E0530C64A8C037B2\",\"platform\":2,\"perPageCount\":10,\"curPage\":1,\"msgType\":6,\"lastReadTime\":1474438383000}";
    private ImageView mBack;
    private TextView mTitle;
    private String mTitleContent;
    private ImageView mSet;
    private PullToRefreshListView mRefresh;
    private ListView mListView;
    private NewsAdapter mAdapter;
    private String TAG=NewsSecondActivity.class.getSimpleName();
    private List<MessageList> mData;
    private ImageView mBackGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_second);

        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        mTitleContent = intent.getStringExtra("title");

        mBack = (ImageView) findViewById(R.id.news_second_back);
        mBack.setOnClickListener(this);

        mTitle = (TextView) findViewById(R.id.news_second_title);
        mTitle.setText(mTitleContent);
        mSet = (ImageView) findViewById(R.id.news_second_set);
        if (!mTitle.getText().equals("新闻鲜播")) {
            mSet.setVisibility(View.VISIBLE);
        }
        mBackGround = ((ImageView) findViewById(R.id.news_second_background));
        mSet.setOnClickListener(this);

        mRefresh = (PullToRefreshListView) findViewById(R.id.news_second_pull_lv);
        mListView = mRefresh.getRefreshableView();
        mAdapter = new NewsAdapter(this, null, R.layout.news_item);
        mListView.setAdapter(mAdapter);
        if (mTitle.getText().equals("新闻鲜播")) {
            setData(NewsSecond_URL);
        }

    }

    private void setData(String url) {
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                MessageLists messageLists = gson.fromJson(result, MessageLists.class);
                mAdapter.update(messageLists.getMessageList());
                mBackGround.setVisibility(View.GONE);
                Log.e(TAG, "onSuccess: "+result );
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.e(TAG, "onError: "+ex.getMessage() );
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.news_second_back:
                finish();
                break;
            case R.id.news_second_set:
                startActivity(new Intent(this,SettingActivity.class));
                break;
        }
    }

}
