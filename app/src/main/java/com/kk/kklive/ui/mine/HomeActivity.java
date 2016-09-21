package com.kk.kklive.ui.mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kk.kklive.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mBack;
    private TextView mCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        mBack = (ImageView) findViewById(R.id.home_back);
        mBack.setOnClickListener(this);
        mCreate = (TextView) findViewById(R.id.home_create);
        mCreate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_back:
                finish();
                break;

            case R.id.home_create:
                Intent intent = new Intent(this, LoadingActivity.class);
                startActivity(intent);
                break;
        }
    }
}
