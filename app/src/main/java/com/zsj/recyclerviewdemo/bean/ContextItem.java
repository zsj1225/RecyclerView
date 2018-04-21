package com.zsj.recyclerviewdemo.bean;

/**
 * @author 朱胜军
 * @date 2018/4/15
 * 描述	      TODO
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   TODO
 */
public class ContextItem implements DisplayableItem {
    private String time;
    private String context;

    public ContextItem() {
    }

    public ContextItem(String time, String context) {
        this.time = time;
        this.context = context;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
