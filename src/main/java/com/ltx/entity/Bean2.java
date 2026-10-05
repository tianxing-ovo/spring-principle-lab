package com.ltx.entity;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 示例组件二
 *
 * @author tianxing
 */
@Data
@Slf4j
public class Bean2 {

    @Resource
    private Bean1 bean1;

    public Bean2(Bean1 bean1) {
        this.bean1 = bean1;
        log.info("有参构造Bean2");
    }

    public Bean2() {
        log.info("无参构造Bean2");
    }
}
