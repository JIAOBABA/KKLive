package com.kk.kklive.ui.fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kk.kklive.KKApp;
import com.kk.kklive.R;
import com.kk.kklive.adapters.DynamicHotAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.DynaicHotLoadData;
import com.kk.kklive.model.DynamicHotData;
import com.kk.kklive.views.FlowLayout;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 动态火热碎片
 */

public class DynamicHotFragment extends Fragment {
    private ListView mListView;
    private View view;
    private View mHeadView;
    private LinearLayout mLinearlayout;
    private LinearLayout mLinearlayoutContent;
    private List<DynamicHotData.HotTopicListBean> mHeadData;
    private boolean isBottom=false;
    private int currentpage = 1;


    private List<DynaicHotLoadData.HotNewsListBean> mHotNewsloadData;
    private DynamicHotAdapter mAdapter;

    private List<DynamicHotData.HotCommentListBean>mCommentData;
    private List<DynamicHotData.HotNewsListBean>mHotNewsData;
    private List<DynamicHotData.RecommendNewsListBean>mRecommendData;
    private int width;
    private int height;
    private ImageView mImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_dynamic_hot, null);
        mHeadView = inflater.inflate(R.layout.item_dynamic_hot_headview, null);


        //设置资源
        initView();
        //初始化数据源
        initData();
        //绑定适配器
        setData();

        //滑动监听
        setListener();
        return view;
    }

    private void setListener() {
        //监听Listview
        mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                //判断条件到底部和停止滚动时
                if (isBottom && i == SCROLL_STATE_IDLE){
                    currentpage ++;
                    isBottom = false;
                    loadListViewData(currentpage);
                }
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                //是否滚动到底部的判断条件
                isBottom = i +i1==i2;
            }
        });
    }

    private void initView() {
        //获取屏幕宽高
        width = getResources().getDisplayMetrics().widthPixels;
        height = getResources().getDisplayMetrics().heightPixels;
        //加载过程中动画  逐帧动画
        mImageView = (ImageView) view.findViewById(R.id.iv_dynamichot_load);
        mImageView.setBackgroundResource(R.drawable.dynamicanimation);
        AnimationDrawable drawable = (AnimationDrawable) mImageView.getBackground();
        drawable.start();
        //火热ListView
        mListView = (ListView) view.findViewById(R.id.lv_dynamic_hot_show);
        //加头布局  是一个类似横向ListView
        mLinearlayout = (LinearLayout) mHeadView.findViewById(R.id.linear_dynamic_hot_head);
        mLinearlayoutContent = (LinearLayout) mHeadView.findViewById(R.id.linear_dynamic_hot_head_content);
        mListView.addHeaderView(mHeadView);
        //网络请求
        final RequestParams params = new RequestParams(HttpConstant.DYNAMIC_HOT_PATH);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (result != null) {
                    //请求成功加载动画消失
                    mImageView.setVisibility(View.GONE);
                    Gson gson = new Gson();
                    DynamicHotData dynamicHotData = gson.fromJson(result, DynamicHotData.class);
                    //头布局添加数据源
                    mHeadData.addAll(dynamicHotData.getHotTopicList());
                    //ListView前两个主播
                    mHotNewsData.addAll(dynamicHotData.getHotNewsList());
                    //TODO 后面的主播
                    mRecommendData.addAll(dynamicHotData.getRecommendNewsList());
                    //热门评论
                    mCommentData.addAll(dynamicHotData.getHotCommentList());
                    loadHeadData();
                    loadHotNewsData();
                    loadCommentData();
                    loadRecommentData();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(getActivity(),"网络有误，请重新加载",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

        loadListViewData(currentpage);

    }
    //分页
    private void loadListViewData(int page) {
        RequestParams params1 = new RequestParams(String.format(HttpConstant.DYNAMIC_HOT_MAIN_PATH,page));
        x.http().get(params1, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                mImageView.setVisibility(View.GONE);
                if (result!= null){
                    Gson gson = new Gson();
                    DynaicHotLoadData dynaicHotLoadData = gson.fromJson(result, DynaicHotLoadData.class);
                    mHotNewsloadData.addAll(dynaicHotLoadData.getHotNewsList());
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
    //热评上方ListView
    private void loadRecommentData() {
        for (int i = 0; i < mRecommendData.size(); i++) {
            View hotNewsView1 = LayoutInflater.from(getActivity()).inflate(R.layout.item_dynamichot_headview_hotnews,null);
            ImageView imageView = (ImageView) hotNewsView1.findViewById(R.id.iv_dynamichot_headview_hotnews);
            ImageView imageView1 = (ImageView) hotNewsView1.findViewById(R.id.iv_dynamichot_headview_hotnews_image);
            TextView textViewTitle = (TextView) hotNewsView1.findViewById(R.id.tv_dynamichot_headview_hotnews_title);
            TextView textViewContent= (TextView) hotNewsView1.findViewById(R.id.tv_dynamichot_headview_hotnews_content);
            TextView textViewTime= (TextView) hotNewsView1.findViewById(R.id.tv_dynamichot_headview_hotnews_time);

            textViewTitle.setText(mRecommendData.get(i).getNickname());
            textViewContent.setText(mRecommendData.get(i).getContent());
            x.image().bind(imageView,HttpConstant.IMAGE_BASE_PATH+mRecommendData.get(i).getPortrait_path_256(), KKApp.getOptions2());



            x.image().bind(imageView1,HttpConstant.IMAGE_BASE_PATH+mRecommendData.get(i).getPicArray().get(0).getImageUrl_400(),KKApp.getOptions());

            ViewGroup.LayoutParams params = imageView1.getLayoutParams();
            params.width = width/2;
            params.height = width/2;
            imageView1.setLayoutParams(params);

            final int finalI = i;
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    previewImageView(finalI,HttpConstant.IMAGE_BASE_PATH+mRecommendData.get(finalI).getPicArray().get(0).getImageUrl_400());
                }
            });
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM月dd日");
            textViewTime.setText(dateFormat.format(mRecommendData.get(i).getPublishedTime()));
            FlowLayout mFlowLayoutComment1 = (FlowLayout) hotNewsView1.findViewById(R.id.flowlayout_dynamichot_comment);
            for (int j = 0; j < mRecommendData.get(i).getCommentList().size(); j++) {
                TextView textView = new TextView(getActivity());
                LinearLayout.LayoutParams params1 =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params1.setMargins(5,5,5,5);
                textView.setLayoutParams(params1);
                textView.setBackgroundResource(R.drawable.flag_conner);
                textView.setText(mRecommendData.get(i).getCommentList().get(j).getContent()+mRecommendData.get(i).getCommentList().get(j).getPraiseNum());
                mFlowLayoutComment1.addView(textView);
            }
            mLinearlayoutContent.addView(hotNewsView1);
        }
    }
    //热评
    private void loadCommentData() {
        View hotNewsView = LayoutInflater.from(getActivity()).inflate(R.layout.item_dynamichot_headview_comment,null);
        FlowLayout mFlowLayoutComment= (FlowLayout) hotNewsView.findViewById(R.id.flowlayout_dynamichot_hotcomment);
        for (int i = 0; i <mCommentData.size() ; i++) {
            TextView textView = new TextView(getActivity());
            LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params1.setMargins(5,5,5,5);
            textView.setLayoutParams(params1);
            textView.setTextColor(Color.BLUE);
            textView.setBackgroundResource(R.drawable.flag_comment);
            textView.setText(mCommentData.get(i).getContent());
            mFlowLayoutComment.addView(textView);
        }
        mLinearlayoutContent.addView(hotNewsView);
    }

    private void loadHeadData() {
        for (int i = 0; i < mHeadData.size(); i++) {
            View headViewItem = LayoutInflater.from(getActivity()).inflate(R.layout.item_dynamichot_headview_item,null);
            ImageView imageView = (ImageView) headViewItem.findViewById(R.id.iv_hot_headview_image);
            TextView tv = (TextView) headViewItem.findViewById(R.id.tv_hot_headview_content);
            if (mHeadData.get(i).getImageUrl()!= null) {
                x.image().bind(imageView, mHeadData.get(i).getImageUrl(), KKApp.getOptions());
            }
            if (mHeadData.get(i).getContent()!= null) {
                tv.setText(mHeadData.get(i).getContent());
            }
            mLinearlayout.addView(headViewItem);
        }
    }
    //热评下方主内容
    private void loadHotNewsData() {

        for (int i = 0; i < mHotNewsData.size(); i++) {
            View hotNewsView = LayoutInflater.from(getActivity()).inflate(R.layout.item_dynamichot_headview_hotnews,null);
            ImageView imageView = (ImageView) hotNewsView.findViewById(R.id.iv_dynamichot_headview_hotnews);
            ImageView imageView1 = (ImageView) hotNewsView.findViewById(R.id.iv_dynamichot_headview_hotnews_image);
            TextView textViewTitle = (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_title);
            TextView textViewContent= (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_content);
            TextView textViewTime= (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_time);
            textViewTitle.setText(mHotNewsData.get(i).getNickname());
            textViewContent.setText(mHotNewsData.get(i).getContent());
            String path =HttpConstant.IMAGE_BASE_PATH+mHotNewsData.get(i).getPortrait_path_256();
            x.image().bind(imageView,HttpConstant.IMAGE_BASE_PATH+mHotNewsData.get(i).getPortrait_path_256(),KKApp.getOptions2());
            x.image().bind(imageView1,path,KKApp.getOptions());
            ViewGroup.LayoutParams params = imageView1.getLayoutParams();
            params.width = width/2;
            params.height = width/2;
            imageView1.setLayoutParams(params);

            final int finalI = i;
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   previewImageView(finalI,HttpConstant.IMAGE_BASE_PATH+mHotNewsData.get(finalI).getPortrait_path_256());
                }
            });



            SimpleDateFormat dateFormat = new SimpleDateFormat("MM月dd日");
            textViewTime.setText(dateFormat.format(mHotNewsData.get(i).getPublishedTime()));
            FlowLayout mFlowLayoutComment = (FlowLayout) hotNewsView.findViewById(R.id.flowlayout_dynamichot_comment);
            for (int j = 0; j < mHotNewsData.get(i).getCommentList().size(); j++) {
                TextView textView = new TextView(getActivity());
                LinearLayout.LayoutParams params1 =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params1.setMargins(5,5,5,5);
                textView.setLayoutParams(params1);
                textView.setBackgroundResource(R.drawable.flag_conner);
                textView.setText(mHotNewsData.get(i).getCommentList().get(j).getContent()+mHotNewsData.get(i).getCommentList().get(j).getPraiseNum());
                mFlowLayoutComment.addView(textView);
            }
            mLinearlayoutContent.addView(hotNewsView);
        }
    }
    //点击看大图
    private void previewImageView(int i,String path) {
        final Dialog dialog = new Dialog(getActivity(),R.style.ImageViewDialog);
        View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.item_preview_image,null);
        dialog.setContentView(view1);
        ImageView imageView2 = (ImageView) view1.findViewById(R.id.iv_preview_image);
        x.image().bind(imageView2,path,KKApp.getOptions3());
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void initData() {
        mHeadData = new ArrayList<>();
        mCommentData = new ArrayList<>();
        mHotNewsData = new ArrayList<>();
        mRecommendData = new ArrayList<>();

        mHotNewsloadData = new ArrayList<>();

    }

    private void setData() {
        mAdapter = new DynamicHotAdapter(mHotNewsloadData,getActivity());
        mListView.setAdapter(mAdapter);
    }
}
