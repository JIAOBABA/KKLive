package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.model.Channel;

import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fei on 2016/9/21.
 */
public class ChannelHeaderAdapter extends RecyclerView.Adapter<ChannelHeaderAdapter.ViewHolder> {

    private List<Channel.PlateListBean> data;
    private LayoutInflater inflater;

    public ChannelHeaderAdapter(Context context,List<Channel.PlateListBean> data) {
        inflater = LayoutInflater.from(context);
        if (data!=null) {
            this.data = data;
        }else {
            this.data = new ArrayList<>();
        }
    }

    public void updateRes(List<Channel.PlateListBean> data){
        if (data!=null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_channel_header,parent,false);
        return new ViewHolder(itemView);
    }

    public Channel.PlateListBean getItem(int position){
        return data.get(position);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageView icon = (ImageView) holder.getView(R.id.item_channel_header_icon);
        TextView title = (TextView) holder.getView(R.id.item_channel_header_title);

        title.setText(getItem(position).getTitle());
        x.image().bind(icon,"http://ures.kktv8.com/kktv"+getItem(position).getIcon());
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
