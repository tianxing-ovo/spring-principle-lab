package com.ltx.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * 用户切面类
 *
 * @author tianxing
 */
@Aspect
@Component
@Slf4j
public class UserAop {

    /**
     * 切入点
     */
    @Pointcut("execution(public void com.ltx.aop.UserService.printProxy())")
    public void pointcut() {
    }

    /**
     * 前置通知: 在目标方法执行前执行
     */
    @Before("pointcut()")
    public void before() {
        log.info("Before Aop");
        // 打印代理对象类名
        log.info("{}", AopContext.currentProxy().getClass().getName());
    }
}
