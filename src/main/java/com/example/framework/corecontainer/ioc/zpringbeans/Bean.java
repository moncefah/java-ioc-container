package com.example.framework.corecontainer.ioc.zpringbeans;

public class Bean {
    private final int beanId;
    private final Object object;
    private final String className;

    public Bean(int beanId, Object object, String className ) {
        this.beanId = beanId;
        this.object = object;
        this.className = className;
    }
}
