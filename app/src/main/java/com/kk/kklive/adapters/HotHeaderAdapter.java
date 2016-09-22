package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fei on 2016/9/21.
 */
public class HotHeaderAdapter extends PagerAdapter {

    private List<String> url = new ArrayList<>();
    private List<ImageView> mImageViews = new ArrayList<>();
    private OnItemClickListener mListener;
    private Context context;

    public void setListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public HotHeaderAdapter(Context context,List<ImageView> mImageViews){
        this.context = context;
        this.mImageViews = mImageViews;
        loadImage();
    }

    public void updateRes(List<String> url){
        if (url!=null) {
            this.url.clear();
            this.url.addAll(url);
            notifyDataSetChanged();
        }
    }

    private void loadImage(){
        for (int i = 0; i < url.size(); i++) {
            ImageView imageView = new ImageView(context);
            Picasso.with(context).load(url.get(i)).into(imageView);
            mImageViews.add(imageView);
        }
    }

    @Override
    public int getCount() {
        return url!=null ? Integer.MAX_VALUE : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (position >= mImageViews.size()) {
            // 将position设置为0～size
            position = position%mImageViews.size();
        }
        ImageView imageView = mImageViews.get(position);
        if (imageView!=null) {
            // 设置适应控件宽高
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ViewParent parent = imageView.getParent();
            if (parent!=null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                // 移除
                viewGroup.removeView(imageView);
            }
            imageView.setTag(position);
            container.addView(imageView);
            return imageView;
        }else {
            return null;
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {}

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
