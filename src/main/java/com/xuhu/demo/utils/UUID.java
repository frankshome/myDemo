package com.xuhu.demo.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by xuhu on 2017/11/8.
 */
public final class UUID {
    public static String generator(){
        return StringUtils.upperCase(StringUtils.replaceAll(java.util.UUID.randomUUID().toString(), "-", ""));
    }

    public static void main(String[] args) {
        System.out.println(UUID.generator());
    }
}
