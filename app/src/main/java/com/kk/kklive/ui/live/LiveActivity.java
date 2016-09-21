package com.kk.kklive.ui.live;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.kk.kklive.R;
import com.kk.kklive.sqlite.UserDAO;
import com.kk.kklive.ui.fragments.LiveBoxFragment;
import com.kk.kklive.ui.fragments.LivePrivateFragment;
import com.kk.kklive.ui.fragments.LivePublicFragment;
import com.kk.kklive.ui.fragments.LiveViewerFragment;
import com.kk.kklive.views.BarrageRelativeLayout;

import java.util.LinkedList;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.VideoView;

public class LiveActivity extends AppCompatActivity {

    private VideoView videoView;

    private LivePublicFragment livePublic;
   //  private LivePrivateFragment livePrivate;
    private LiveViewerFragment liveViewer;
    private LiveBoxFragment liveBox;
    private FragmentManager manager;
    private LinearLayout linearLayout;
    private FragmentTransaction fragmentTransaction;
    private String path;
    private BarrageRelativeLayout mBarrageLayout;
    private boolean isChecked ;
    private String userid;
    private UserDAO dao;
    private String table="anchor";
    private TextView mTextViewAttention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_live);
       // path = getIntent().getStringExtra("path");
        path="http://pull.kktv8.com/livekktv/111308425.flv";
       // userid=getIntent().getStringExtra("id");
        dao=new UserDAO(this);
//        String sql="select * from anchor where type=? and userid=?";
//        Cursor select = dao.select(sql,new String[]{"attention",userid});
//        Log.d("TAG", "----onCreate: cursor=="+select);
//        if(select.getCount()>0) {
//            ((TextView)linearLayout.getChildAt(4)).setText("已关注");
//        }


        Vitamio.isInitialized(this);
        initView();
        initData();
        setData();
        showDanMU();
    }

    private void setData() {
        manager=getSupportFragmentManager();
        fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.add(R.id.fl_computer_live,livePublic);
       // fragmentTransaction.add(R.id.fl_computer_live,livePrivate);
        fragmentTransaction.add(R.id.fl_computer_live,liveViewer);
        fragmentTransaction.add(R.id.fl_computer_live,liveBox);
       // fragmentTransaction.hide(livePrivate);
        fragmentTransaction.hide(liveViewer);
        fragmentTransaction.hide(liveBox);
        fragmentTransaction.commit();


        videoView.setVideoPath(path);

        videoView.start();

    }

    private void initData() {

        livePublic=new LivePublicFragment();
        //livePrivate=new LivePrivateFragment();
        liveViewer=new LiveViewerFragment();
        liveBox=new LiveBoxFragment();
    }

    private void initView() {
        videoView= (VideoView) findViewById(R.id.vv_vitamio_test);
        linearLayout= (LinearLayout) findViewById(R.id.ll_computer_live);
        ((TextView)linearLayout.getChildAt(0)).setTextColor(Color.RED);
        mBarrageLayout = (BarrageRelativeLayout) findViewById(R.id.barrageView_computer_showtitle);
    }

    public void onClick(View view) {
        int childCount=linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView)linearLayout.getChildAt(i)).setTextColor(Color.BLACK);
        }
        fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.hide(livePublic);
        fragmentTransaction.hide(liveViewer);
        fragmentTransaction.hide(liveBox);
        fragmentTransaction.commit();
        ((TextView)view).setTextColor(Color.RED);

        fragmentTransaction=manager.beginTransaction();
        if(view!=null){
            switch (view.getId()){
                case R.id.tv_computer_live_public:
                    fragmentTransaction.show(livePublic);
                    fragmentTransaction.commit();
                    break;
                case R.id.tv_computer_live_private:
                    if (isChecked) {
                        ((TextView) view).setText("关闭弹幕");
                        showDanMU();
                        isChecked = false;
                    }else {
                        if (mBarrageLayout != null){
                            mBarrageLayout.setVisibility(View.GONE);
                            ((TextView) view).setText("打开弹幕");
                            isChecked = true;
                        }
                    }
                    break;

                case R.id.tv_computer_live_viewer:
                    fragmentTransaction.show(liveViewer);
                    fragmentTransaction.commit();
                    break;
                case R.id.tv_computer_live_box:
                    fragmentTransaction.show(liveBox);
                    fragmentTransaction.commit();
                    break;
                case R.id.tv_computer_live_attention:
//                    ((TextView)linearLayout.getChildAt(4)).setText("已关注");
//                    ContentValues values=new ContentValues();
//                    values.put("type","attention");
//                    values.put("userid",userid);
//                    dao.insert(table,values);

                    break;
                default:
                    break;


            }
        }
    }

    public void onClick1(View view) {
        if (view!= null){
            switch (view.getId()){
                case R.id.iv_computerlive_share:

                    showShare();
                    break;
                case R.id.iv_computerlive_roomout:

                    finish();
                    break;
            }
        }
    }


    public void showDanMU(){
        mBarrageLayout.setVisibility(View.VISIBLE);


        String[] itemText = {"王飞好漂亮", "美", "王飞泥奏凯","王飞大傻叼","王飞大傻叼","王飞大傻叼", "王飞大傻叼"};
        LinkedList<String> texts=new LinkedList<String>();
        for(int i=0;i<itemText.length;i++){
            texts.add(itemText[i]);
        }
        mBarrageLayout.setBarrageTexts(texts);
        mBarrageLayout.show(BarrageRelativeLayout.RANDOM_SHOW);

    }
    private void showShare() {
        ShareSDK.initSDK(this);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle("1611");
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://www.baidu.com");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://www.163.com");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是分享的内容");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sport.sina.com");

        // 启动分享GUI
        oks.show(this);
    }
}
