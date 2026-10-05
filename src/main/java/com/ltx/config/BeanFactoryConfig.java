package com.ltx.config;

import com.ltx.entity.Bean1;
import com.ltx.entity.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 对象工厂配置类
 *
 * @author tianxing
 */
@Configuration
public class BeanFactoryConfig {

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean
    public Bean2 bean2() {
        return new Bean2();
    }
}
