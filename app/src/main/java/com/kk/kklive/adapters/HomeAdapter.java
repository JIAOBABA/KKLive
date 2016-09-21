package com.kk.kklive.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.homemodel.FamilyList;
import com.rock.teachlibrary.adapters.TeachMultiTypeBaseAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
public class HomeAdapter extends TeachMultiTypeBaseAdapter<FamilyList> {

    private ImageView mImage;
    private TextView mName;
    private TextView mLeader;
    private TextView mActorCount;
    private TextView mMemberCount;

    public static final String Image_URL="/familyposter/20151015/8/89688292_3155.jpg!222";
    private Context mContext;

    public HomeAdapter(Context context, List<FamilyList> data, int... layoutResIds) {
        super(context, data, layoutResIds);
        mContext=context;
    }

    @Override
    public void bindData(ViewHolder holder, FamilyList familyList) {
        mImage = ((ImageView) holder.getView(R.id.home_item_image));
        mName = ((TextView) holder.getView(R.id.home_item_familyName));
        mLeader = ((TextView) holder.getView(R.id.home_item_familyLeader));
        mActorCount = ((TextView) holder.getView(R.id.home_item_actorCount));
        mMemberCount = ((TextView) holder.getView(R.id.home_item_memberCount));

        mName.setText(familyList.getFamilyName());
        mLeader.setText("族长"+familyList.getFamilyLeader()+"人");
        mActorCount.setText("主播"+familyList.getActorCount()+"人");
        mMemberCount.setText("成员"+familyList.getMemberCount()+"人");
        Picasso.with(mContext).load(HttpConstant.IMAGE_BASE_PATH+Image_URL).into(mImage);
    }
}
