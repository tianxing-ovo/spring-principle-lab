package com.ltx.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 *
 * @author tianxing
 */
public class CustomEvent extends ApplicationEvent {

    /**
     * 构造方法
     *
     * @param source 事件源
     */
    public CustomEvent(Object source) {
        super(source);
    }
}
