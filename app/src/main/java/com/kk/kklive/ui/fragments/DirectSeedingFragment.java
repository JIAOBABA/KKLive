package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.kklive.R;
import com.kk.kklive.adapters.DirectSeedingAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 直播碎片
 * Created by fei on 2016/9/20.
 */
public class DirectSeedingFragment extends BaseFragment {

    public static final String TAG = DirectSeedingFragment.class.getSimpleName();
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private DirectSeedingAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_direct_seeding,container,false);
        initView();
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void initView() {
        mTabLayout = ((TabLayout) layout.findViewById(R.id.direct_seeding_tab_layout));
        mViewPager = ((ViewPager) layout.findViewById(R.id.direct_seeding_viewpager));
        List<Fragment> data = new ArrayList<>();
        data.add(new HomePageFragment());
        data.add(new HotFragment());
        data.add(new ChannelFragment());
        String [] title = getResources().getStringArray(R.array.direct_seeding_tabs);
        mAdapter = new DirectSeedingAdapter(getChildFragmentManager(),data,title);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
