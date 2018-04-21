package com.zsj.recyclerviewdemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import com.zsj.recyclerviewdemo.R;
import com.zsj.recyclerviewdemo.bean.DisplayableItem;
import com.zsj.recyclerviewdemo.bean.TitleItem;
import com.zsj.recyclerviewdemo.rvlib.CommonAdapter;
import com.zsj.recyclerviewdemo.rvlib.EmptyRecyclerView;
import com.zsj.recyclerviewdemo.rvlib.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class EmptyLayoutActivity extends AppCompatActivity {

    private EmptyRecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_layout);

        initView();

        initData();
    }

    private void initData() {
        ArrayList<DisplayableItem> titleItems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
//            titleItems.add(new TitleItem("内容" + i));
        }
        mRv.setAdapter(new MyAdapter(this, R.layout.item_text_layout, titleItems));
    }

    class MyAdapter extends CommonAdapter<DisplayableItem> {

        public MyAdapter(Context context, int layoutId, List<DisplayableItem> datas) {
            super(context, layoutId, datas);
        }

        @Override
        protected void convert(ViewHolder holder, DisplayableItem displayableItem, int position) {
            TitleItem item = (TitleItem) displayableItem;
            holder.setText(R.id.textView, item.getTitle());
        }
    }

    private void initView() {
        mRv = findViewById(R.id.empty_rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        View view = LayoutInflater.from(this).inflate(R.layout.empty_layout, null, false);
        mRv.setEmptyView(view);
    }
}
