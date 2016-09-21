package com.kk.kklive.ui.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


import com.google.gson.Gson;
import com.kk.kklive.R;
import com.kk.kklive.adapters.DynamicAttentionAdapter;
import com.kk.kklive.constants.HttpConstant;
import com.kk.kklive.model.DynamicAttentionData;
import com.kk.kklive.sqlite.UserDAO;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态关注碎片
 */

public class DynamicAttentionFragment extends Fragment{


    private static final String TAG = DynamicAttentionFragment.class.getSimpleName();
    private View view;
    private ListView mListView;
    private UserDAO dao;

    private List<DynamicAttentionData.RoomListBean> mData;
    private DynamicAttentionAdapter mAdapter;
    private String url;
    private String id;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_mine_attention,null);
        //数据库查询
        dao=new UserDAO(getActivity());
        String sql="select * from anchor where type=?";
        Cursor select = dao.select(sql, new String[]{"attention"});

        StringBuffer buffer=new StringBuffer();
        if(select.getCount()==0) {
            buffer.append("109573225"+",");
        }else {
            while (select.moveToNext()) {
                id = select.getString(select.getColumnIndex("userid"));
                buffer.append(id + ",");
           }
        }
        buffer.deleteCharAt(buffer.lastIndexOf(","));

        String path= HttpConstant.DYNAMIC_ATTENTION_PATH;
        url = String.format(path, buffer.toString());
        Log.e(TAG, "onCreateView: "+url );
        initView();
        initData();
        setData();

        return view;
    }
    private void setData() {
        mListView.setAdapter(mAdapter);
    }

    private void initData() {
        mData=new ArrayList<>();
        mAdapter = new DynamicAttentionAdapter(getActivity(), mData);
        RequestParams params=new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if(result!=null) {
                    Gson gson = new Gson();
                    mData.addAll((gson.fromJson(result, DynamicAttentionData.class)).getRoomList());
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(getActivity(), "网络连接错误，请检查网络", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void initView() {

        mListView= (ListView) view.findViewById(R.id.lv_mine_attention);
    }
}
