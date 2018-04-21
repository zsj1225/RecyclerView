package com.zsj.recyclerviewdemo.bean;

/**
 * @author 朱胜军
 * @date 2018/4/14
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class TitleItem implements DisplayableItem {
    private String title;

    public TitleItem(String title) {
        this.title = title;
    }

    public TitleItem() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

