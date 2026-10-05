package com.ltx.listener;

import com.ltx.event.CustomEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听器
 *
 * @author tianxing
 */
@Component
@Slf4j
public class CustomEventListener {

    /**
     * 处理自定义事件
     *
     * @param customEvent 自定义事件
     */
    @EventListener
    public void handleCustomEvent(CustomEvent customEvent) {
        log.info("{}", customEvent);
    }
}
