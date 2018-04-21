package com.zsj.recyclerviewdemo.delagates;

import com.zsj.recyclerviewdemo.R;
import com.zsj.recyclerviewdemo.bean.DisplayableItem;
import com.zsj.recyclerviewdemo.bean.TitleItem;
import com.zsj.recyclerviewdemo.rvlib.base.ItemViewDelegate;
import com.zsj.recyclerviewdemo.rvlib.base.ViewHolder;

/**
 * @author 朱胜军
 * @date 2018/4/21
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class TittleDelegates implements ItemViewDelegate<DisplayableItem> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_title_layout;
    }

    @Override
    public boolean isForViewType(DisplayableItem item, int position) {
        return item instanceof TitleItem;
    }

    @Override
    public void convert(ViewHolder holder, DisplayableItem displayableItem, int position) {
        TitleItem titleItem = (TitleItem) displayableItem;
        holder.setText(R.id.tv_title, titleItem.getTitle());
    }
}
