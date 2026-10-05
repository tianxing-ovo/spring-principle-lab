package com.ltx.aop;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 用户服务类测试
 *
 * @author tianxing
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void printProxy() {
        userService.printProxy();
        // 是否为AOP代理对象: true
        assertTrue(AopUtils.isAopProxy(userService));
        // 是否为CGLIB代理创建的代理对象: true
        assertTrue(AopUtils.isCglibProxy(userService));
        // 是否为JDK动态代理创建的代理对象: false
        assertFalse(AopUtils.isJdkDynamicProxy(userService));
    }

}