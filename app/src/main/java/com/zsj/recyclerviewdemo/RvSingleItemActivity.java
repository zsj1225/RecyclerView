package com.zsj.recyclerviewdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewStub;

import com.zsj.recyclerviewdemo.rvlib.CommonAdapter;
import com.zsj.recyclerviewdemo.rvlib.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zsj
 * 单种Item布局
 */
public class RvSingleItemActivity extends AppCompatActivity {

    private ViewStub mViewstub_nodata;
    private RecyclerView mRv;
    private ArrayList<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item);

        mRv = (RecyclerView) findViewById(R.id.rv);
        initData();

        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(new MyAdapter(this,R.layout.item_context_layout,mDatas));
    }

    private class MyAdapter extends CommonAdapter<String> {


        public MyAdapter(Context context, int layoutId, List<String> datas) {
            super(context, layoutId, datas);
        }

        @Override
        protected void convert(ViewHolder holder, String s, int position) {
            holder.setText(R.id.textView,mDatas.get(position));
        }
    }

    private void initData() {
        mDatas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mDatas.add("ii" + i);
        }
    }
}