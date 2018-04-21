package com.zsj.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zsj.recyclerviewdemo.bean.ContextItem;
import com.zsj.recyclerviewdemo.bean.DisplayableItem;
import com.zsj.recyclerviewdemo.bean.TitleItem;

import java.util.ArrayList;

/**
 * @author zsj
 * 多布局 代理
 */
public class MultiltemTpyeActivity extends AppCompatActivity {

    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiltem_tpye);
        initView();
        initData();
    }

    private void initData() {
        ArrayList<DisplayableItem> items = new ArrayList<>();

        items.add(new TitleItem("标题1"));
        for (int i = 0; i < 10; i++) {
            items.add(new ContextItem("2018年4月21日" + i, "内容 " + i));
        }
        items.add(new TitleItem("标题2"));
//        items.add(new ContextItem("内容1"))
        for (int i = 0; i < 10; i++) {
            items.add(new ContextItem("2018-4-21" + i, "22 内容" + i));
        }

        mRv.setAdapter(new MultilAdapter(this, items));
    }


    private void initView() {
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));

        //通过以下方法添加分割线
        mRv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}
