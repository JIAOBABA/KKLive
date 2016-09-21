package com.kk.kklive.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.kklive.R;
import com.kk.kklive.ui.mine.LoadingActivity;

/**
 * 消息碎片
 * Created by fei on 2016/9/20.
 */
public class NewsFragment extends BaseFragment {

    public static final String TAG = NewsFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_news,container,false);
        initView();
        return layout;
    }

    private void initView() {
        Intent intent = new Intent(getActivity(), LoadingActivity.class);
        startActivity(intent);
    }
}
