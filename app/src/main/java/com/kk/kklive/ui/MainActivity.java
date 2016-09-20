package com.kk.kklive.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.kk.kklive.R;
import com.kk.kklive.ui.fragments.DirectSeedingFragment;
import com.kk.kklive.ui.fragments.DynamicFragment;
import com.kk.kklive.ui.fragments.MineFragment;
import com.kk.kklive.ui.fragments.NewsFragment;

import java.lang.reflect.InvocationTargetException;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private RadioGroup mRadioGroup;
    private ImageView mImageView;
    private Fragment mShowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.main_radio_group);
        mRadioGroup.setOnCheckedChangeListener(this);
        mImageView = (ImageView) findViewById(R.id.main_image);
        mImageView.setOnClickListener(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mShowFragment = new DirectSeedingFragment();
        transaction.add(R.id.main_container, mShowFragment,DirectSeedingFragment.TAG);
        transaction.commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.main_direct_seeding:
                switchPages(DirectSeedingFragment.TAG,DirectSeedingFragment.class);
                break;
            case R.id.main_dynamic:
                switchPages(DynamicFragment.TAG,DynamicFragment.class);
                break;
            case R.id.main_news:
                switchPages(NewsFragment.TAG,NewsFragment.class);
                break;
            case R.id.main_mine:
                switchPages(MineFragment.TAG,MineFragment.class);
                break;
        }
    }
    
    public void switchPages(String tag,Class<? extends Fragment> cls){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.hide(mShowFragment);
        mShowFragment = fm.findFragmentByTag(tag);
        if (mShowFragment != null) {
            transaction.show(mShowFragment);
        }else {
            try {
                mShowFragment = cls.getConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            transaction.add(R.id.main_container,mShowFragment,tag);
        }
        transaction.commit();
    }

    @Override
    public void onClick(View v) {

    }
}
