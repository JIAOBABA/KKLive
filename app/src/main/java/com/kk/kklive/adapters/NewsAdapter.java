package com.kk.kklive.adapters;

import android.content.Context;
import android.support.v4.view.ViewGroupCompat;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.newsmodel.MessageList;
import com.rock.teachlibrary.adapters.TeachMultiTypeBaseAdapter;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
public class NewsAdapter extends TeachMultiTypeBaseAdapter<MessageList> {

    private TextView mTitle;
    private TextView mTime;
    private TextView mMsg;
    private ImageView mImage;

    private Context mContext;
    public NewsAdapter(Context context, List<MessageList> data, int... layoutResIds) {
        super(context, data, layoutResIds);
        mContext=context;
    }

    @Override
    public void bindData(ViewHolder holder, MessageList messageList) {
        mTitle = ((TextView) holder.getView(R.id.news_item_title));
        mTime = ((TextView) holder.getView(R.id.news_item_time));
        mMsg = ((TextView) holder.getView(R.id.news_item_msg));
        mImage = ((ImageView) holder.getView(R.id.news_item_image));

        mTitle.setText(messageList.getTitle());

        mMsg.setText(messageList.getMessage());

        Picasso.with(mContext).load(messageList.getImg())
                .placeholder(R.mipmap.loading_1)
                .into(mImage);
        long time = Long.valueOf(messageList.getMsgtime());
        Date date = new Date(time);
        String format = new SimpleDateFormat("MM月dd日").format(date);
        mTime.setText(format);
    }
}
