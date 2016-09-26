package com.kk.kklive.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.Hot;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by fei on 2016/9/21.
 */
public class HotAdapter extends BaseAdapter implements StickyListHeadersAdapter, View.OnClickListener {

    private List<Hot.RoomListBean> data;
    private LayoutInflater inflater;
    private ImageOptions mOptions;
    private OnItemClickListener mListener;

    public void setListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public HotAdapter(Context context, List<Hot.RoomListBean> data) {
        inflater = LayoutInflater.from(context);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }
        mOptions = new ImageOptions.Builder()
                .setSquare(true)
                .setRadius(10)
                .setLoadingDrawableId(R.mipmap.kk_room_honor_default_icon)
                .setFailureDrawableId(R.mipmap.kk_room_honor_none_img)
                .build();
    }

    public void updateRes(List<Hot.RoomListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    public void addRes(List<Hot.RoomListBean> data){
        if (data!=null) {
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return data!=null ? data.size()/2 : 0;
    }

    @Override
    public Hot.RoomListBean getItem(int position) {
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
            convertView = inflater.inflate(R.layout.item_hot_sticky,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageView icon = (ImageView) holder.getViewRes(R.id.item_hot_icon);
        TextView roomTheme = (TextView) holder.getViewRes(R.id.item_hot_roomTheme);
        TextView nickName = (TextView) holder.getViewRes(R.id.item_hot_nickname);
        TextView onLineCount = (TextView) holder.getViewRes(R.id.item_hot_online_count);
        ImageView image = (ImageView) holder.getViewRes(R.id.item_hot_sticky_image);

        ImageView icon1 = (ImageView) holder.getViewRes(R.id.item_hot_icon1);
        TextView roomTheme1 = (TextView) holder.getViewRes(R.id.item_hot_roomTheme1);
        TextView nickName1 = (TextView) holder.getViewRes(R.id.item_hot_nickname1);
        TextView onLineCount1 = (TextView) holder.getViewRes(R.id.item_hot_online_count1);
        ImageView image1 = (ImageView) holder.getViewRes(R.id.item_hot_sticky_image);

        x.image().bind(icon, HttpConstant.IMAGE_BASE_PATH+getItem(2*position).getPortrait_path_256(),mOptions);
        roomTheme.setText(getItem(position * 2).getRoomTheme());
        nickName.setText(getItem(2*position).getNickname());
        onLineCount.setText(String.valueOf(getItem(2*position).getOnlineCount()));
        if (getItem(position*2).getOnlineCount()<10000) {
            image.setImageResource(R.mipmap.kk_bang_video_hd_topbar_people);
        }else {
            image.setImageResource(R.mipmap.kk_most_hot_pressed);
        }

        x.image().bind(icon1,HttpConstant.IMAGE_BASE_PATH+getItem(position*2+1).getPortrait_path_256(),mOptions);
        roomTheme1.setText(getItem(position * 2+1).getRoomTheme());
        nickName1.setText(getItem(position*2+1).getNickname());
        onLineCount1.setText(String.valueOf(getItem(position*2+1).getOnlineCount()));
        if (getItem(position*2+1).getOnlineCount()<10000) {
            image1.setImageResource(R.mipmap.kk_bang_video_hd_topbar_people);
        }else {
            image1.setImageResource(R.mipmap.kk_most_hot_pressed);
        }
        icon.setOnClickListener(this);
        icon1.setOnClickListener(this);
        icon.setTag(position*2);
        icon1.setTag(position*2+1);

        return convertView;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_hot_sticky_header,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        TextView popularAnchor = (TextView) holder.getViewRes(R.id.item_hot_sticky_header_popular_anchor);
        popularAnchor.setOnClickListener(this);
        popularAnchor.setTag(popularAnchor);

        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return 1;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_hot_icon:
            case R.id.item_hot_icon1:
                Integer position = (Integer) v.getTag();
                mListener.onItemClick(position);
                break;
            case R.id.item_hot_sticky_header_popular_anchor:
                TextView view = (TextView) v.getTag();
                mListener.onHeaderItemClick(view);
                break;
        }


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

    public interface OnItemClickListener{
        void onHeaderItemClick(View view);
        void onItemClick(int position);
    }

}
