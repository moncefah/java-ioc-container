package com.example.framework.corecontainer.ioc.zpringbeans;

public class Bean {
    private final String className;
    private final int beanId;
    private String beanName;

    public Bean(String className, int beanId) {
        this.className = className;
        this.beanId = beanId;
    }
}
