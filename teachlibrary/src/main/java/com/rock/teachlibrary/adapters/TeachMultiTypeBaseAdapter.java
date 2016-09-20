package com.rock.teachlibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rock on 2016/8/17.
 */
public abstract class TeachMultiTypeBaseAdapter<T> extends BaseAdapter {

    private List<T> data;

    private int[] layoutResIds;

    private LayoutInflater inflater;

    public TeachMultiTypeBaseAdapter(Context context,List<T> data,int... layoutResIds){
        this.layoutResIds = layoutResIds;
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

    public void update(List<T> data){
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

    /**
     * 返回布局种类数
     * @return
     */
    @Override
    public int getViewTypeCount() {
        return layoutResIds.length;
    }

    /**
     * 根据postion返回它对应的类型
     *
     * type 必须从 0 开始0,1,2,3...
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        int type = 0;
        // 根据位置获取对应的数据
        T t = getItem(position);
        // 使用反射对T中type字段就行获取
        Class<?> cls = t.getClass();
        try {
            // 获取一个type对应的字段
            Field field = cls.getDeclaredField("type");
            // 设置一下访问权限
            field.setAccessible(true);
            // 从Filed字段中获取值
            type = field.getInt(t);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(layoutResIds[getItemViewType(position)],parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        // 数据加载
        bindData(holder,getItem(position));

        return convertView;
    }

    public abstract void bindData(ViewHolder holder, T t);

    public static class ViewHolder{

        private View convertView;

        private Map<Integer,View> mCacheViews;

        public ViewHolder(View convertView){
            this.convertView = convertView;
            mCacheViews = new HashMap<>();
        }

        public View getView(int resId){
            View view = null;
            if (mCacheViews.containsKey(resId)) {
                view = mCacheViews.get(resId);
            }else{
                view = convertView.findViewById(resId);
                mCacheViews.put(resId,view);
            }
            return view;
        }

    }

}
