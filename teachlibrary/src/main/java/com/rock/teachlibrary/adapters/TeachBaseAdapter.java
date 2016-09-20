package com.rock.teachlibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rock on 2016/8/17.
 */
public abstract class TeachBaseAdapter<T> extends BaseAdapter {

    private List<T> data;

    private LayoutInflater inflater;

    private int layoutResId;

    public TeachBaseAdapter(Context context,List<T> data,int layoutResId){
        this.layoutResId = layoutResId;
        inflater = LayoutInflater.from(context);
        if (data != null) {
            this.data = data;
        }else{
            this.data = new ArrayList<>();
        }
    }

    public void addRes(List<T> data){
        if (data != null) {
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    public void updateRes(List<T> data){
        if (data != null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }


    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public T getItem(int position) {
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
            convertView = inflater.inflate(layoutResId,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        // 加载数据

        bindData(holder,getItem(position));

        return convertView;
    }

    protected abstract void bindData(ViewHolder holder, T item);

    /**
     * ViewHolder对ListView做出的优化
     * 减少findViewById的次数
     * findViewById是一个非常耗时的过程
     *
     * 我们在封装了万能ViewHolder的时候
     * 我们不知道具体的itemView的子控件，但是我们提供实例化子控件的方法
     * 我们对已经实例化的View做了一个缓存，使用了一个Map<Integer,View>
     *     key 使用View的id来进行缓存
     *     value 就是id对应的View
     *
     *  缓存流程
     *      ① 去缓存的Map中进行查找
     *      ② 如果存在，直接返回，如果不存在，实例化View，添加到缓存中
     *
     */
    public static class ViewHolder{

        private View convertView;
        private Map<Integer,View> mCacheViews;

        public ViewHolder(View convertView){
            this.convertView = convertView;
            mCacheViews = new HashMap<>();
        }
        public View getView(int viewId){
            View view = null;
            // 判断缓存集合中是否包含我们的View
            if (mCacheViews.containsKey(viewId)) {
                // 缓存集合中有 直接进行获取
                view = mCacheViews.get(viewId);
            }else{
                // findViewById进行初始化
                view = convertView.findViewById(viewId);
                // 将初始化好的View 添加到缓存中
                mCacheViews.put(viewId,view);
            }
            return view;
        }

    }

}
