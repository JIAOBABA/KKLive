package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 * 动态碎片ViewPager适配器
 */
public class DynamicPagerAdapter extends FragmentPagerAdapter {
    //Fragment集合
    private List<Fragment> mData;
    private Context mContext;
    //TabLayout标题
    private List<String> mTitles;
    public DynamicPagerAdapter(FragmentManager fm, List<Fragment> mData, Context mContext, List<String> titles) {
        super(fm);
        this.mData = mData;
        this.mContext = mContext;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData == null?0:mData.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
