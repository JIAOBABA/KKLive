package com.kk.kklive.adapters;

import android.app.Dialog;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.kk.kklive.KKApp;
import com.kk.kklive.R;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.DynaicHotLoadData;
import com.kk.kklive.views.FlowLayout;

import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 动态火热适配器
 */
public class DynamicHotAdapter extends BaseAdapter {
    private List<DynaicHotLoadData.HotNewsListBean> mData;
    private Context mContext;
    private ImageView mImageView;

    public DynamicHotAdapter(List<DynaicHotLoadData.HotNewsListBean> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder holder = null;
        final int finalI = i;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_dynamichot_load, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);

        } else {
            holder = (MyViewHolder) view.getTag();
        }
        holder.textViewTitle.setText(mData.get(i).getNickname());
        holder.textViewContent.setText(mData.get(i).getContent());
        String path = HttpConstant.IMAGE_BASE_PATH + mData.get(i).getPortrait_path_256();
        x.image().bind(holder.imageView, HttpConstant.IMAGE_BASE_PATH + mData.get(i).getPortrait_path_256(), KKApp.getOptions2());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM月dd日");
        holder.textViewTime.setText(dateFormat.format(mData.get(i).getPublishedTime()));

        holder.mFlowLayoutComment1.removeAllViews();
        if (mData.get(i).getCommentList()!= null) {
            for (int j = 0; j < mData.get(i).getCommentList().size(); j++) {
                TextView textView = new TextView(mContext);
                LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params1.setMargins(5, 5, 5, 5);
                textView.setLayoutParams(params1);
                textView.setBackgroundResource(R.drawable.flag_conner);
                textView.setText(mData.get(i).getCommentList().get(j).getContent() + mData.get(i).getCommentList().get(j).getPraiseNum());
                holder.mFlowLayoutComment1.addView(textView);
            }
        }
        int width = mContext.getResources().getDisplayMetrics().widthPixels;
        int height = mContext.getResources().getDisplayMetrics().heightPixels;

        holder.mFlowLayoutComment.removeAllViews();
        if (mData.get(i).getPicArray() != null) {
            for (int j = 0; j < mData.get(i).getPicArray().size(); j++) {
                mImageView = new ImageView(mContext);
                LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                if (mData.get(i).getPicArray().size() == 1) {
                    params2.width = width / 2 + 15;
                    params2.height = width / 2 + 15;
                } else if (mData.get(i).getPicArray().size() % 2 == 0) {
                    params2.width = width / 3 +20;
                    params2.height = width / 3 +20;
                } else {
                    params2.width = width / 3 - 20;
                    params2.height = width / 3 - 20;
                }
                params2.setMargins(10, 10, 10, 10);
                mImageView.setLayoutParams(params2);
                x.image().bind(mImageView, HttpConstant.IMAGE_BASE_PATH + mData.get(i).getPicArray().get(j).getImageUrl_720(), KKApp.getOptions());
                final int finalJ = j;
                mImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        previewImageView(finalI, HttpConstant.IMAGE_BASE_PATH + mData.get(finalI).getPicArray().get(finalJ).getImageUrl_720());
                    }
                });
                holder.mFlowLayoutComment.addView(mImageView);
            }
        }

        return view;
    }

    static class MyViewHolder {
        ImageView imageView;
        TextView textViewTitle, textViewContent, textViewTime;
        FlowLayout mFlowLayoutComment, mFlowLayoutComment1;

        public MyViewHolder(View hotNewsView) {
            imageView = (ImageView) hotNewsView.findViewById(R.id.iv_dynamichot_headview_hotnews1);
            textViewTitle = (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_title1);
            textViewContent = (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_content1);
            textViewTime = (TextView) hotNewsView.findViewById(R.id.tv_dynamichot_headview_hotnews_time1);
            mFlowLayoutComment = (FlowLayout) hotNewsView.findViewById(R.id.flowlayout_dynamichot_comment1);
            mFlowLayoutComment1 = (FlowLayout) hotNewsView.findViewById(R.id.flowlayout_dynamichot_comment2);
        }
    }


    private void previewImageView(int i, String path) {
        final Dialog dialog = new Dialog(mContext, R.style.ImageViewDialog);
        View view1 = LayoutInflater.from(mContext).inflate(R.layout.item_preview_image, null);
        dialog.setContentView(view1);
        ImageView imageView2 = (ImageView) view1.findViewById(R.id.iv_preview_image);
        x.image().bind(imageView2, path, KKApp.getOptions3());
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
