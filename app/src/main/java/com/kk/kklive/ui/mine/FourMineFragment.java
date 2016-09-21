package com.kk.kklive.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.kklive.R;
import com.kk.kklive.ui.fragments.BaseFragment;

/**
 * Created by Administrator on 2016/9/20.
 */
public class FourMineFragment extends BaseFragment {
    public static final String TAG=FourMineFragment.class.getCanonicalName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_hot, container, false);
        return layout;
    }
}
