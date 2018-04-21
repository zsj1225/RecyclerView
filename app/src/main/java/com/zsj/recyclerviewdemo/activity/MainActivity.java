package com.zsj.recyclerviewdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zsj.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleItemLayout(View view) {
        startActivity(new Intent(this, RvSingleItemActivity.class));
    }

    public void multiLayout(View view) {
        startActivity(new Intent(this, MultiltemTpyeActivity.class));
    }

    public void emptyLayout(View view) {
        startActivity(new Intent(this, EmptyLayoutActivity.class));
    }
}
