package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.Recommend;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fei on 2016/9/26.
 */
public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> implements View.OnClickListener {

    private List<Recommend.RoomListBean> data;
    private LayoutInflater inflater;
    private ImageOptions mOptions;
    private OnItemClickListener mListener;

    public void setListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public RecommendAdapter(Context context, List<Recommend.RoomListBean> data){
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
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_activity_recommend,parent,false);
        return new ViewHolder(itemView);
    }

    public Recommend.RoomListBean getItem(int position){
        return data.get(position);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageView icon = (ImageView) holder.getViewRes(R.id.item_activity_recommend_icon);
        TextView roomTheme = (TextView) holder.getViewRes(R.id.item_activity_recommend_roomTheme);
        TextView nickName = (TextView) holder.getViewRes(R.id.item_activity_recommend_nickname);
        TextView onLineCount = (TextView) holder.getViewRes(R.id.item_activity_recommend_online_count);
        ImageView image = (ImageView) holder.getViewRes(R.id.item_activity_recommend_sticky_image);

        x.image().bind(icon,HttpConstant.IMAGE_BASE_PATH+getItem(position).getPortrait_path_256(),mOptions);
        roomTheme.setText(getItem(position).getRoomTheme());
        nickName.setText(getItem(position).getNickname());
        onLineCount.setText(String.valueOf(getItem(position).getOnlineCount()));
        if (getItem(position).getOnlineCount()<10000) {
            image.setImageResource(R.mipmap.kk_bang_video_hd_topbar_people);
        }else {
            image.setImageResource(R.mipmap.kk_most_hot_pressed);
        }
        icon.setOnClickListener(this);
        icon.setTag(position);
    }

    @Override
    public int getItemCount() {
        return data!=null?data.size():0;
    }

    @Override
    public void onClick(View v) {
        Integer position = (Integer) v.getTag();
        mListener.onItemClick(position);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private Map<Integer,View> mCacheViews;

        public ViewHolder(View convertView){
            super(convertView);
            mCacheViews = new HashMap<>();
        }

        public View getViewRes(int resId){
            View view = null;
            if (mCacheViews.containsKey(resId)) {
                view = mCacheViews.get(resId);
            }else {
                view = itemView.findViewById(resId);
                mCacheViews.put(resId,view);
            }
            return view;
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

}
