package com.kk.kklive.ui.mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.kk.kklive.R;
import com.kk.kklive.adapters.HomeAdapter;
import com.kk.kklive.homemodel.FamilyLists;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import javax.security.auth.login.LoginException;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String Home_URL=
            "http://api.kktv1.com:8080/meShow/entrance?parameter=" +
                    "{\"a\":1,\"c\":221,\"FuncTag\":10008001,\"platform\":2,\"start\":0,\"offset\":20}";
    private ImageView mBack;
    private TextView mCreate;
    private PullToRefreshGridView mRefresh;
    private GridView mGridView;
    private HomeAdapter mAdapter;
    private ImageView mBackGround;
    private String TAG=HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        mBack = (ImageView) findViewById(R.id.home_back);
        mBack.setOnClickListener(this);
        mCreate = (TextView) findViewById(R.id.home_create);
        mCreate.setOnClickListener(this);

        mBackGround = ((ImageView) findViewById(R.id.home_background));

        mRefresh = (PullToRefreshGridView) findViewById(R.id.home_pull_gv);
        mGridView = mRefresh.getRefreshableView();
        mGridView.setNumColumns(2);
        mAdapter = new HomeAdapter(this,null,R.layout.home_item);
        mGridView.setAdapter(mAdapter);
        setData();
    }

    private void setData() {
        RequestParams params = new RequestParams(Home_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                FamilyLists familyLists = gson.fromJson(result, FamilyLists.class);
                mAdapter.update(familyLists.getFamilyList());
                mBackGround.setVisibility(View.GONE);
                Log.e(TAG, "onSuccess: "+Home_URL );
                Log.e(TAG, "onSuccess: "+result );
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.e(TAG, "onError: 原因："+ex.getMessage()+"!!!" );
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
            case R.id.home_back:
                finish();
                break;

            case R.id.home_create:
                Intent intent = new Intent(this, LoadingActivity.class);
                startActivity(intent);
                break;
        }
    }
}
