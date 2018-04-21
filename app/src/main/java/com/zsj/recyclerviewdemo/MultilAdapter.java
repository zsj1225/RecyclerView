package com.zsj.recyclerviewdemo;

import android.content.Context;

import com.zsj.recyclerviewdemo.bean.DisplayableItem;
import com.zsj.recyclerviewdemo.delagates.ContextDelegates;
import com.zsj.recyclerviewdemo.delagates.TittleDelegates;
import com.zsj.recyclerviewdemo.rvlib.MultiItemTypeAdapter;

import java.util.List;

/**
 * @author 朱胜军
 * @date 2018/4/21
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class MultilAdapter extends MultiItemTypeAdapter<DisplayableItem> {
    public MultilAdapter(Context context, List<DisplayableItem> datas) {
        super(context, datas);

        addItemViewDelegate(new TittleDelegates());
        addItemViewDelegate(new ContextDelegates());
    }
}
