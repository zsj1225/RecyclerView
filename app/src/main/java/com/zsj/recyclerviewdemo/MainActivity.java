package com.zsj.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleItemLayout(View view) {
        startActivity(new Intent(this, RvSingleItemActivity.class));
    }

    public void multilLayout(View view) {
        startActivity(new Intent(this,MultiltemTpyeActivity.class));
    }
}
