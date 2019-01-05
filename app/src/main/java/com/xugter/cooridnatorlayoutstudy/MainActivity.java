package com.xugter.cooridnatorlayoutstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xugter.cooridnatorlayoutstudy.base.BaseActivity1;
import com.xugter.cooridnatorlayoutstudy.base.BaseActivity2;
import com.xugter.cooridnatorlayoutstudy.base.BaseActivity3;
import com.xugter.cooridnatorlayoutstudy.first.FirstActivity;
import com.xugter.cooridnatorlayoutstudy.scroll.ScrollActivity;
import com.xugter.cooridnatorlayoutstudy.simpletitle.SimpleTitleActivity;
import com.xugter.cooridnatorlayoutstudy.test.TestActivity;
import com.xugter.cooridnatorlayoutstudy.xiami.XiamiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleTitle(View view) {
        startActivity(new Intent(this, SimpleTitleActivity.class));
    }

    public void test(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }

    public void first(View view) {
        startActivity(new Intent(this, FirstActivity.class));
    }

    public void scroll(View view) {
        startActivity(new Intent(this, ScrollActivity.class));
    }

    public void xiami(View view) {
        startActivity(new Intent(this, XiamiActivity.class));
    }

    public void base1(View view) {
        startActivity(new Intent(this, BaseActivity1.class));
    }

    public void base2(View view) {
        startActivity(new Intent(this, BaseActivity2.class));
    }

    public void base3(View view) {
        startActivity(new Intent(this, BaseActivity3.class));
    }
}
