package com.kk.kklive.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.kk.kklive.KKApp;
import com.kk.kklive.R;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.DynamicAttentionData;

import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 动态关注适配器
 */

public class DynamicAttentionAdapter extends BaseAdapter{


    private Context mContext;
    private List<DynamicAttentionData.RoomListBean> mData;
    public DynamicAttentionAdapter(Context context, List<DynamicAttentionData.RoomListBean> data){
        mContext= context;
        mData=data;
    }
    @Override
    public int getCount() {
        return mData==null?0:mData.size();
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
        ViewHolder holder=null;
        if(view==null){
            view= LayoutInflater.from(mContext).inflate(R.layout.item_dynamic_attention,null);
            holder=new ViewHolder(view);
            view.setTag(holder);
        }else{

            holder= (ViewHolder) view.getTag();
        }

        holder.tv_author.setText(mData.get(i).getNickname());
        holder.tv_onlinecount.setText(mData.get(i).getOnlineCount()+"");
        long time=System.currentTimeMillis()-mData.get(i).getLivestarttime();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = new Date(time);
        String timeStr = format.format(date1);
        holder.tv_playtime.setText("已开播"+timeStr+"分钟");
        x.image().bind(holder.imageView, HttpConstant.IMAGE_BASE_PATH+mData.get(i).getPortrait_path_256(), KKApp.getOptions2());

        return view;
    }


    public static  class ViewHolder{
        private ImageView imageView;
        private TextView tv_author,tv_onlinecount,tv_playtime;


        public ViewHolder(View view){
            imageView= (ImageView) view.findViewById(R.id.iv_item_mine_author);
            tv_author= (TextView) view.findViewById(R.id.tv_item_mine_name);
            tv_onlinecount= (TextView) view.findViewById(R.id.tv_item_mine_onlinecount);
            tv_playtime= (TextView) view.findViewById(R.id.tv_item_mine_playtime);
        }

    }
}
