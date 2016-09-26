package com.kk.kklive.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.kk.kklive.R;

/**
 * Created by Rock on 2016/8/29.
 */
public class PullToRefreshRecyclerView extends PullToRefreshBase<RecyclerView> {
    public PullToRefreshRecyclerView(Context context) {
        super(context);
    }

    public PullToRefreshRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshRecyclerView(Context context, Mode mode) {
        super(context, mode);
    }

    public PullToRefreshRecyclerView(Context context, Mode mode, AnimationStyle animStyle) {
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
    protected RecyclerView createRefreshableView(Context context, AttributeSet attrs) {
        RecyclerView recyclerView = new RecyclerView(context, attrs);
        // 设置一个id
        recyclerView.setId(R.id.recycler);

        return recyclerView;
    }
    /**

     * 是否准备好 下拉刷新（从左向右拉的刷新） 从开始的地方刷新
     * @return  true 准备好了  false 不进入刷新状态，没准备好
     */
    @Override
    protected boolean isReadyForPullStart() {
        // 获取刷新的View
        RecyclerView recyclerView = getRefreshableView();
        // 获取RecyclerView中的第一项
        View child = recyclerView.getChildAt(0);
        // 获取RecyclerView的顶部内边距
        int paddingTop = recyclerView.getPaddingTop();
        // 获取child的顶部外边距
        MarginLayoutParams params = (MarginLayoutParams) child.getLayoutParams();
        int topMargin = params.topMargin;
        // 获取第一个item距离顶部的高度
        int top = child.getTop();

        return top == paddingTop + topMargin;
    }

    /**
     * 是否准备好 上拉加载（从右向左的刷新） 从结束的地方刷新
     * @return     true 准备好了  false 不进入刷新状态，没准备好
     */
    @Override
    protected boolean isReadyForPullEnd() {
        // 获取刷新的View
        RecyclerView recyclerView = getRefreshableView();
        // 获取RecyclerView的最后一个item
        int childCount = recyclerView.getChildCount();
        View child = recyclerView.getChildAt(childCount - 1);
        // 获取RecyclerView的高度
        int height = recyclerView.getHeight();
        // 获取RecyclerView底部内边距
        int paddingBottom = recyclerView.getPaddingBottom();
        // 获取最后一个item的底部外边距
        MarginLayoutParams params = (MarginLayoutParams) child.getLayoutParams();
        int bottomMargin = params.bottomMargin;
        // 获取child 底部距离RecyclerView顶部的距离
        int bottom = child.getBottom();

        // 添加一个判断条件 获取一下RecyclerView的Adapter中的item条数
        int itemCount = recyclerView.getAdapter().getItemCount();
        // 计算最后一个view在适配器中的位置
        int childAdapterPosition = recyclerView.getChildAdapterPosition(child);

        return height == bottom + bottomMargin + paddingBottom  && itemCount == childAdapterPosition + 1;
    }

}
