package com.kk.kklive.views;

import android.content.Context;
import android.util.AttributeSet;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * Created by fei on 2016/9/23.
 */
public class StickyListView extends StickyListHeadersListView {
    public StickyListView(Context context) {
        this(context,null);
    }

    public StickyListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public StickyListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
