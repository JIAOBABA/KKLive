package com.kk.kklive.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kk.kklive.model.DirectSeedingAdvertisement;
import com.kk.kklive.ui.fragments.HotHeaderFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fei on 2016/9/22.
 */
public class HotHeaderFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> data;
    private List<DirectSeedingAdvertisement.ActivityListBean> list;

    public HotHeaderFragmentAdapter(FragmentManager fm,List<Fragment> data) {
        super(fm);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }

    }

    public void upDateRes(List<Fragment> data,List<DirectSeedingAdvertisement.ActivityListBean> list){
        if (data!=null&&list!=null) {
            this.data.clear();
            this.list = list;
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public Fragment getItem(int position) {
        HotHeaderFragment fragment = new HotHeaderFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text",list.get(position%list.size()).getTopMobileURL());
        fragment.setArguments(bundle);
        data.add(fragment);
        return fragment;
    }

    @Override
    public int getCount() {
        return list!=null?list.size()==0?0:Integer.MAX_VALUE/2:0;
    }
}
