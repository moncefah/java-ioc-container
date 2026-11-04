package com.example.framework.corecontainer.ioc.zpringbeans;

import com.example.framework.corecontainer.ioc.BeansException;
import com.example.framework.corecontainer.ioc.Container;

public class DefaultBeanFactory{

    private final Container container;
    public DefaultBeanFactory(BeanDefinition beanDefinition) {
        this.container = new Container();

    }

    public Object getBean(String className) throws BeansException {
        return null;
    }

    public void initContainer(){

    }








}
