package com.kk.kklive.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.minemodel.RoomList;
import com.rock.teachlibrary.adapters.TeachMultiTypeBaseAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
public class OneMineAdapter extends TeachMultiTypeBaseAdapter<RoomList> {

    private Context mContext;
    private ImageView mImage;
    private TextView mName;
    private TextView mCount;
    private TextView mTime;
    private ImageView mImageAttention;

    public OneMineAdapter(Context context, List<RoomList> data, int... layoutResIds) {
        super(context, data, layoutResIds);
        mContext=context;
    }

    @Override
    public void bindData(ViewHolder holder, RoomList roomList) {
        mImage = ((ImageView) holder.getView(R.id.mine_one_item_image));
        mName = ((TextView) holder.getView(R.id.mine_one_item_name));
        mCount = ((TextView) holder.getView(R.id.mine_one_item_count));
        mTime = ((TextView) holder.getView(R.id.mine_one_item_time));

        mImageAttention = ((ImageView) holder.getView(R.id.mine_one_item_image_attention));

        Picasso.with(mContext).load(roomList.getPortrait_path_original()).into(mImage);
        mName.setText(roomList.getNickname());
        mCount.setText(roomList.getOnlineCount());
        //需要格式化时间
        long time = Long.valueOf(roomList.getLivestarttime());
        long hours = (time % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        String h=hours+"小时";
        long minutes = (time % (1000 * 60 * 60)) / (1000 * 60);
        String min=minutes+"分钟";
        long seconds = (time % (1000 * 60)) / 1000;
        String s=seconds+"秒";
        mTime.setText("已开播"+h+min);
    }
}
