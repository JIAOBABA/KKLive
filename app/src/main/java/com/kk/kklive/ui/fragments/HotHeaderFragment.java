package com.kk.kklive.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kk.kklive.R;
import com.rock.teachlibrary.ImageLoader;
import com.squareup.picasso.Picasso;

import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * Created by fei on 2016/9/22.
 */
public class HotHeaderFragment extends BaseFragment {

    private static final String TAG = HotHeaderFragment.class.getSimpleName();
    private ImageOptions mOptions = new ImageOptions.Builder()
            .setLoadingDrawableId(R.mipmap.loading_1)
            .setFailureDrawableId(R.mipmap.kk_im_left_thumb_loading)
            .build();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_hot_header,container,false);
        ImageView imageView = (ImageView) layout.findViewById(R.id.fragment_hot_header_image);
        Bundle arguments = getArguments();
        String image = arguments.getString("text", "失败");
        Log.e(TAG, "onCreateView: "+image );
//        ImageLoader.display(imageView,image,R.mipmap.loading_1);
//        Picasso.with(getActivity()).load(image).placeholder(R.mipmap.loading_1).error(R.mipmap.app_icon).into(imageView);
        x.image().bind(imageView,image,mOptions);
        return layout;
    }

}
