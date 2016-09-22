package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.model.Hot;
import com.kk.kklive.model.Recommend;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by fei on 2016/9/20.
 */
public class HomePageRecommendAdapter extends BaseAdapter implements StickyListHeadersAdapter, View.OnClickListener {

    private List<Recommend.RoomListBean> data;
    private LayoutInflater inflater;
    private ImageOptions mOptions;
    private OnItemClickListener mListener;

    public void setListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public HomePageRecommendAdapter(Context context, List<Recommend.RoomListBean> data) {
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

    public void updateRes(List<Recommend.RoomListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    public void addRes(List<Recommend.RoomListBean> data){
        if (data!=null) {
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return data!=null ? (data.size() + 1)/2 : 0;
    }

    @Override
    public Recommend.RoomListBean getItem(int position) {
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
            convertView = inflater.inflate(R.layout.item_home_page_recommend_sticky,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageView icon = (ImageView) holder.getViewRes(R.id.item_home_page_recommend_icon);
        TextView roomTheme = (TextView) holder.getViewRes(R.id.item_home_page_recommend_roomTheme);
        TextView nickName = (TextView) holder.getViewRes(R.id.item_home_page_recommend_nickname);
        TextView onLineCount = (TextView) holder.getViewRes(R.id.item_home_page_recommend_online_count);

        ImageView icon1 = (ImageView) holder.getViewRes(R.id.item_home_page_recommend_icon1);
        TextView roomTheme1 = (TextView) holder.getViewRes(R.id.item_home_page_recommend_roomTheme1);
        TextView nickName1 = (TextView) holder.getViewRes(R.id.item_home_page_recommend_nickname1);
        TextView onLineCount1 = (TextView) holder.getViewRes(R.id.item_home_page_recommend_online_count1);

        x.image().bind(icon,"http://ures.kktv8.com/kktv"+getItem(2*position).getPortrait_path_256(),mOptions);
        roomTheme.setText(getItem(position * 2).getRoomTheme());
        nickName.setText(getItem(2*position).getNickname());
        onLineCount.setText(String.valueOf(getItem(2*position).getOnlineCount()));

        x.image().bind(icon1,"http://ures.kktv8.com/kktv"+getItem(position*2+1).getPortrait_path_256(),mOptions);
        roomTheme1.setText(getItem(position * 2+1).getRoomTheme());
        nickName1.setText(getItem(position*2+1).getNickname());
        onLineCount1.setText(String.valueOf(getItem(position*2+1).getOnlineCount()));

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
            convertView = inflater.inflate(R.layout.item_home_page_recommend_sticky_header,parent,false);
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

    @Override
    public void onClick(View v) {
        Integer position = (Integer) v.getTag();
        mListener.onItemClick(position);
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
        void onItemClick(int position);
    }
}
