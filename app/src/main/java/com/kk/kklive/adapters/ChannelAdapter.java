package com.kk.kklive.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.model.Channel;

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
public class ChannelAdapter extends BaseAdapter implements StickyListHeadersAdapter, View.OnClickListener {

    private static final String TAG = ChannelAdapter.class.getSimpleName();
    private List<Channel.PlateListBean> data;
    private List<Channel.PlateListBean.ResultBean> result;
    private LayoutInflater inflater;
    private ImageOptions mOptions;
    private OnItemClickListener mListener;

    public void setListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public ChannelAdapter(Context context, List<Channel.PlateListBean> data){
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

    public void updateRes(List<Channel.PlateListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return data!=null ? data.size() : 0;
    }

    @Override
    public Channel.PlateListBean getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_channel_sticky,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageView image = (ImageView) holder.getViewRes(R.id.item_channel_sticky_image);
        TextView nickName = (TextView) holder.getViewRes(R.id.item_channel_sticky_nickname);
        TextView onLineCount = (TextView) holder.getViewRes(R.id.item_channel_sticky_online_count);
        TextView roomTheme = (TextView) holder.getViewRes(R.id.item_channel_sticky_roomTheme);
        ImageView image2 = (ImageView) holder.getViewRes(R.id.item_channel_sticky_image2);
        TextView nickName2 = (TextView) holder.getViewRes(R.id.item_channel_sticky_nickname2);
        TextView onLineCount2 = (TextView) holder.getViewRes(R.id.item_channel_sticky_online_count2);
        TextView roomTheme2 = (TextView) holder.getViewRes(R.id.item_channel_sticky_roomTheme2);

        ImageView image3 = (ImageView) holder.getViewRes(R.id.item_channel_sticky_image3);
        TextView nickName3 = (TextView) holder.getViewRes(R.id.item_channel_sticky_nickname3);
        TextView onLineCount3 = (TextView) holder.getViewRes(R.id.item_channel_sticky_online_count3);
        TextView roomTheme3 = (TextView) holder.getViewRes(R.id.item_channel_sticky_roomTheme3);
        ImageView image4 = (ImageView) holder.getViewRes(R.id.item_channel_sticky_image4);
        TextView nickName4 = (TextView) holder.getViewRes(R.id.item_channel_sticky_nickname4);
        TextView onLineCount4 = (TextView) holder.getViewRes(R.id.item_channel_sticky_online_count4);
        TextView roomTheme4 = (TextView) holder.getViewRes(R.id.item_channel_sticky_roomTheme4);

        nickName.setText(getItem(position).getResult().get(0).getNickname());
        onLineCount.setText(String.valueOf(getItem(position).getResult().get(0).getOnlineCount()));
        roomTheme.setText(getItem(position).getResult().get(0).getRoomTheme());
        x.image().bind(image,"http://ures.kktv8.com/kktv"+getItem(position).getResult().get(0).getPortrait_path_256(),mOptions);

        nickName2.setText(getItem(position).getResult().get(1).getNickname());
        onLineCount2.setText(String.valueOf(getItem(position).getResult().get(1).getOnlineCount()));
        roomTheme2.setText(getItem(position).getResult().get(1).getRoomTheme());
        x.image().bind(image2,"http://ures.kktv8.com/kktv"+getItem(position).getResult().get(1).getPortrait_path_256(),mOptions);

        nickName3.setText(getItem(position).getResult().get(2).getNickname());
        onLineCount3.setText(String.valueOf(getItem(position).getResult().get(2).getOnlineCount()));
        roomTheme3.setText(getItem(position).getResult().get(2).getRoomTheme());
        x.image().bind(image3,"http://ures.kktv8.com/kktv"+getItem(position).getResult().get(2).getPortrait_path_256(),mOptions);

        nickName4.setText(getItem(position).getResult().get(3).getNickname());
        onLineCount4.setText(String.valueOf(getItem(position).getResult().get(3).getOnlineCount()));
        roomTheme4.setText(getItem(position).getResult().get(3).getRoomTheme());
        x.image().bind(image4,"http://ures.kktv8.com/kktv"+getItem(position).getResult().get(3).getPortrait_path_256(),mOptions);

        image.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image.setTag(position*4);
        image2.setTag(position*4+1);
        image3.setTag(position*4+2);
        image4.setTag(position*4+3);

        return convertView;
    }


    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_channel_sticky_header,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        TextView title = (TextView) holder.getViewRes(R.id.item_channel_sticky_header_title);
        title.setText(getItem(position).getTitle());
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return position;
    }

    @Override
    public void onClick(View v) {
        Integer position = (Integer) v.getTag();
        mListener.onItemClick(position);
    }

    /**
     * 万能ViewHolder
     *
     */
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
        void  onItemClick(int position);
    }

}
