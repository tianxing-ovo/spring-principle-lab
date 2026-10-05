package com.ltx.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 常量类
 *
 * @author tianxing
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

    public static final String CLASS_PATH_CONFIG_LOCATION = "spring.xml";
    public static final String FILE_SYSTEM_CONFIG_LOCATION = "src/main/resources/spring.xml";
    public static final String BEAN_NAME = "config";
}
