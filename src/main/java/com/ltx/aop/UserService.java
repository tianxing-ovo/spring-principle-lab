package com.ltx.aop;


import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * 用户服务类
 *
 * @author tianxing
 */
@Service
@Slf4j
public class UserService {

    public void printProxy() {
        // 打印目标对象类名
        log.info("Target instance (this): {}", this.getClass().getName());
        // 打印代理对象类名
        log.info("Proxy instance: {}", AopContext.currentProxy().getClass().getName());
    }
}
