package com.kk.kklive.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fei on 2016/9/20.
 */
public class DirectSeedingAdapter extends FragmentPagerAdapter {

    private List<Fragment> data;
    private String [] title;

    public DirectSeedingAdapter(FragmentManager fm,List<Fragment> data,String [] title) {
        super(fm);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data!=null ? data.size() : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

}
