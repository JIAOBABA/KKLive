package com.kk.kklive.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * Created by fei on 2016/9/21.
 */
public class PullToRefreshStickyListHeadersListView extends PullToRefreshBase<StickyListHeadersListView> {
    public PullToRefreshStickyListHeadersListView(Context context) {
        super(context);
    }

    public PullToRefreshStickyListHeadersListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshStickyListHeadersListView(Context context, Mode mode) {
        super(context, mode);
    }

    public PullToRefreshStickyListHeadersListView(Context context, Mode mode, AnimationStyle animStyle) {
        super(context, mode, animStyle);
    }

    /**
     * 获取刷新滚动的方向
     * @return
     */
    @Override
    public Orientation getPullToRefreshScrollDirection() {
        return Orientation.VERTICAL;
    }

    /**
     *
     * @param context Context to create view with
     * @param attrs AttributeSet from wrapped class. Means that anything you
     *            include in the XML layout declaration will be routed to the
     *            created View
     * @return
     */
    @Override
    protected StickyListHeadersListView createRefreshableView(Context context, AttributeSet attrs) {
        StickyListHeadersListView stickyListHeadersListView = new StickyListHeadersListView(context, attrs);
        // 设置一个id
        stickyListHeadersListView.setId(R.id.stickyListHeadersListView);

        return stickyListHeadersListView;
    }

    /**
     * 是否准备好 下拉刷新（从左向右拉的刷新） 从开始的地方刷新
     * @return true 准备好了  false 不进入刷新状态，没准备好
     */
    @Override
    protected boolean isReadyForPullStart() {
        // 获取刷新的View
        StickyListHeadersListView stickyListHeadersListView = getRefreshableView();
        // 获取StickyListHeadersListView中的第一项
        View child = stickyListHeadersListView.getChildAt(0);
        // 获取StickyListHeadersListView的顶部内边距
        int paddingTop = stickyListHeadersListView.getPaddingTop();
        // 获取child的顶部外边距
        MarginLayoutParams params = (MarginLayoutParams) child.getLayoutParams();
        int topMargin = params.topMargin;
        // 获取第一个item距离顶部的高度
        int top = child.getTop();

        return top == paddingTop + topMargin + 5;
    }

    /**
     * 是否准备好 上拉加载（从右向左的刷新） 从结束的地方刷新
     * @return true 准备好了  false 不进入刷新状态，没准备好
     */
    @Override
    protected boolean isReadyForPullEnd() {
        // 获取刷新的View
        StickyListHeadersListView stickyListHeadersListView = getRefreshableView();
        // 获取StickyListHeadersListView的最后一个item
        int childCount = stickyListHeadersListView.getChildCount();
        View child = stickyListHeadersListView.getChildAt(childCount - 1);
        // 获取StickyListHeadersListView的高度
        int height = stickyListHeadersListView.getHeight();
        // 获取StickyListHeadersListView的底部内边距
        int paddingBottom = stickyListHeadersListView.getPaddingBottom();
        // 获取StickyListHeadersListView的底部外边距
        MarginLayoutParams params = (MarginLayoutParams) child.getLayoutParams();
        int bottomMargin = params.bottomMargin;
        // 获取child底部距离StickyListHeadersListView顶部的距离
        int bottom = child.getBottom();
        // 添加一个判断条件 获取一下StickyListHeadersListView的Adapter中的item条数
        int count = stickyListHeadersListView.getAdapter().getCount();
        // 计算最后一个view在适配器中的位置
        int positionForView = stickyListHeadersListView.getPositionForView(child);


        return height == bottom + bottomMargin + paddingBottom+100 && count == positionForView + 1;

    }

}
