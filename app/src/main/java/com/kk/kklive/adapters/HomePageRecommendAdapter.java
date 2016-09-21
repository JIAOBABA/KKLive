package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.model.Recommend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fei on 2016/9/20.
 */
public class HomePageRecommendAdapter extends RecyclerView.Adapter<HomePageRecommendAdapter.ViewHolder> {

    private List<Recommend.RoomListBean> data;
    private LayoutInflater inflater;

    public HomePageRecommendAdapter(Context context, List<Recommend.RoomListBean> data){
        inflater = LayoutInflater.from(context);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }
    }

    public void updataRes(List<Recommend.RoomListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =  inflater.inflate(R.layout.item_recommend,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageView image = (ImageView) holder.getView(R.id.item_recommend_image);
        TextView nickName = (TextView) holder.getView(R.id.item_recommend_nickname);
        TextView onLineCount = (TextView) holder.getView(R.id.item_recommend_online_count);
        nickName.setText(data.get(position).getNickname());
        onLineCount.setText(String.valueOf(data.get(position).getOnlineCount()));
    }

    @Override
    public int getItemCount() {
        return data!=null ? data.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private Map<Integer,View> mCacheViews;

        public ViewHolder(View itemView) {
            super(itemView);
            mCacheViews = new HashMap<>();
        }

        public View getView(int resId){
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
}
