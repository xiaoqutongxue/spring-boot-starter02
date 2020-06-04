package com.atguigu.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 绑定所有以atguigu.hello开始的配置
@ConfigurationProperties(prefix = "atguigu.hello")
public class HelloProperties {

    // 前缀
    private String prefix;
    // 后缀
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
