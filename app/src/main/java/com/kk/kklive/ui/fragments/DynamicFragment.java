package com.kk.kklive.ui.fragments;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.kk.kklive.R;
import com.kk.kklive.adapters.DynamicPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态碎片
 * Created by fei on 2016/9/20.
 */
public class DynamicFragment extends BaseFragment {
    private View layout;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ImageView mImageView;
    private DynamicPagerAdapter mAdapter;
    List<Fragment> mFragments;
    List<String> mTitles;
    private PopupWindow popupWindow;


    public static final String TAG = DynamicFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_dynamic,container,false);
        //初始化控件
        initView();
        //设置适配器 添加碎片  添加TabLayout标题
        initData();
        //绑定适配器
        setData();
        //监听PoPupWindow
        setListener();
        return layout;
    }

    private void initView() {
        mViewPager= (ViewPager) layout.findViewById(R.id.vp_dynamic_content);
        mTabLayout= (TabLayout) layout.findViewById(R.id.tab_dynamic_title);
        mImageView= (ImageView) layout.findViewById(R.id.iv_dynamix_camera);


    }

    private void initData() {
        mTitles=new ArrayList<>();
        mTitles.add("热门");
        mTitles.add("关注");

        mFragments=new ArrayList<>();
        mFragments.add(new DynamicHotFragment());
        mFragments.add(new DynamicAttentionFragment());
        mAdapter=new DynamicPagerAdapter(getChildFragmentManager(),mFragments,getActivity(),mTitles);
    }

    private void setData() {
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
    private void setListener() {
        mImageView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupWindow();
                    }
                });
    }

    private void showPopupWindow(){
        //设置contentView
        View contentView=LayoutInflater.from(getActivity()).inflate(R.layout.pop_dynamic_camera,null);
        popupWindow =new PopupWindow(contentView);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setContentView(contentView);

        //设置各个控件的点击响应
        RelativeLayout relativeLayout= (RelativeLayout) contentView.findViewById(R.id.relative_pop_dynamic);
        ImageView iv_pic= (ImageView) contentView.findViewById(R.id.iv_pop_pics);
        ImageView iv_camera= (ImageView) contentView.findViewById(R.id.iv_pop_camera);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        iv_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "图库", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
                popupWindow.dismiss();
            }
        });
        iv_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "相机", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
                startActivity(intent);
                popupWindow.dismiss();
            }
        });
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setOutsideTouchable(true);

        //显示popupwindow
        popupWindow.showAtLocation(mImageView, Gravity.NO_GRAVITY,0,0);
    }
}
