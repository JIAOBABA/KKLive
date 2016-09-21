package com.kk.kklive.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.ui.news.NewsSecondActivity;

/**
 * 消息碎片
 * Created by fei on 2016/9/20.
 */
public class NewsFragment extends BaseFragment implements View.OnClickListener {

    public static final String TAG = NewsFragment.class.getSimpleName();
    public static final String News_URL=
            "http://api.kktv1.com:8080/meShow/entrance?parameter={platform:2,token:A13AA753CD6177FDD7E0530C64A8C02A6F,c:216,curPage:1,perPageCount:10,userId:111610576,a:1,msgType:9,lastReadTime:1471940283000,FuncTag:50006104}";
    private LinearLayout mNews;
    private LinearLayout mPing;
    private LinearLayout mZan;
    private LinearLayout mSystem;
    private TextView mNewTitle;
    private TextView mNewCount;
    private TextView mPingTitle;
    private TextView mZanTitle;
    private TextView mSystemTitle;
    private ImageView mCreate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_news,container,false);
        initView();
        return layout;
    }

    private void initView() {
//        Intent intent = new Intent(getActivity(), LoadingActivity.class);
//        startActivity(intent);
        mCreate = ((ImageView) layout.findViewById(R.id.news_create));
        mCreate.setOnClickListener(this);

        mNews = (LinearLayout)layout. findViewById(R.id.news_new);
        mNews.setOnClickListener(this);
        mPing = (LinearLayout)layout. findViewById(R.id.news_ping);
        mPing.setOnClickListener(this);
        mZan = (LinearLayout)layout. findViewById(R.id.news_zan);
        mZan.setOnClickListener(this);
        mSystem = (LinearLayout)layout. findViewById(R.id.news_system);
        mSystem.setOnClickListener(this);

        mNewTitle = ((TextView) layout.findViewById(R.id.news_new_title));
        mNewCount = ((TextView) layout.findViewById(R.id.news_new_content));
        mPingTitle = ((TextView) layout.findViewById(R.id.news_ping_title));
        mZanTitle = ((TextView) layout.findViewById(R.id.news_zan_title));
        mSystemTitle = ((TextView) layout.findViewById(R.id.news_system_title));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.news_create:
                Intent intent = new Intent(getContext(), NewsSecondActivity.class);
                intent.putExtra("title","群组");
                startActivity(intent);
                break;
            case R.id.news_new:
                Intent intent1 = new Intent(getContext(), NewsSecondActivity.class);
                intent1.putExtra("title",mNewTitle.getText());
                startActivity(intent1);
                break;
            case R.id.news_ping:
                Intent intent2 = new Intent(getContext(), NewsSecondActivity.class);
                intent2.putExtra("title",mPingTitle.getText());
                startActivity(intent2);
                break;
            case R.id.news_zan:
                Intent intent3 = new Intent(getContext(), NewsSecondActivity.class);
                intent3.putExtra("title",mZanTitle.getText());
                startActivity(intent3);
                break;
            case R.id.news_system:
                Intent intent4 = new Intent(getContext(), NewsSecondActivity.class);
                intent4.putExtra("title",mSystemTitle.getText());
                startActivity(intent4);
                break;
        }
    }

}
