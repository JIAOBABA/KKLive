package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.kklive.R;

/**
 * 动态碎片
 * Created by fei on 2016/9/20.
 */
public class DynamicFragment extends BaseFragment {

    public static final String TAG = DynamicFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_dynamic,container,false);
        return layout;
    }
}
