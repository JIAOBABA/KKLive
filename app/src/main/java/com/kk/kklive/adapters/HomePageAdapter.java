package com.kk.kklive.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.model.StarWars;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by fei on 2016/9/22.
 */
public class HomePageAdapter extends BaseAdapter implements StickyListHeadersAdapter{

    private List<StarWars.RankListBean> data;
    private LayoutInflater inflater;
    private ImageOptions mOptions;

    public HomePageAdapter(Context context,List<StarWars.RankListBean> data){
        inflater = LayoutInflater.from(context);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }
        mOptions = new ImageOptions.Builder()
                .setCircular(true)
                .build();
    }

    public void updateRes(List<StarWars.RankListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return data!=null ? data.size()/3 : 0;
    }

    @Override
    public StarWars.RankListBean getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_home_page_star_wars,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageView leftImage = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_left_image);
        TextView leftNick = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_left_nick);
        ImageView leftPic = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_left_pic);
        TextView leftName = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_left_name);

        ImageView middleImage = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_middle_image);
        TextView middleNick = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_middle_nick);
        ImageView middlePic = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_middle_pic);
        TextView middleName = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_middle_name);

        ImageView rightImage = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_right_image);
        TextView rightNick = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_right_nick);
        ImageView rightPic = (ImageView) holder.getViewRes(R.id.item_home_page_star_wars_right_pic);
        TextView rightName = (TextView) holder.getViewRes(R.id.item_home_page_star_wars_right_name);

        x.image().bind(middleImage,getItem(position*3).getPortrait_path_256(),mOptions);
        middleNick.setText(getItem(position*3).getNickName());
        x.image().bind(middlePic,getItem(position*3).getGiftPic());
        middleName.setText(getItem(position*3).getGiftName());

        x.image().bind(leftImage,getItem(position*3+1).getPortrait_path_256(),mOptions);
        leftNick.setText(getItem(position*3+1).getNickName());
        x.image().bind(leftPic,getItem(position*3+1).getGiftPic());
        leftName.setText(getItem(position*3+1).getGiftName());

        x.image().bind(rightImage,getItem(position*3+2).getPortrait_path_256(),mOptions);
        rightNick.setText(getItem(position*3+2).getNickName());
        x.image().bind(rightPic,getItem(position*3+2).getGiftPic());
        rightName.setText(getItem(position*3+2).getGiftName());

        return convertView;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_home_page_star_wars_header,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return 1;
    }

    class ViewHolder{
        private View convertView;
        private Map<Integer,View> mCacheViews;

        public ViewHolder(View convertView){
            this.convertView = convertView;
            mCacheViews = new HashMap<>();
        }

        public View getViewRes(int resId){
            View view = null;
            if (mCacheViews.containsKey(resId)) {
                view = mCacheViews.get(resId);
            }else {
                view = convertView.findViewById(resId);
                mCacheViews.put(resId,view);
            }
            return view;
        }
    }

}
