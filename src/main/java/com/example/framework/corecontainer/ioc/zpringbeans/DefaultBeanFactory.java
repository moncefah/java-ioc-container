package com.example.framework.corecontainer.ioc.zpringbeans;

import com.example.framework.corecontainer.ioc.BeansException;
import com.example.framework.corecontainer.ioc.Container;

import java.lang.reflect.InvocationTargetException;

public class DefaultBeanFactory{

    private final Container container;
    public DefaultBeanFactory(BeanDefinitionRegistry beanDefinitionRegistry) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.container = new Container();
        for (var beanDefinition: beanDefinitionRegistry.getBeanDefinitionList()){
                var bean = createBean(beanDefinition);
                this.container.appendBean(bean);
        }
    }

    public Object getBean(String className) throws BeansException {
        return null;
    }

    public void initContainer(){

    }

    private Bean createBean(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var object = clazz.getDeclaredConstructor().newInstance();
        Bean bean = new Bean(container.getIdCounter(), object, clazz.getName());
        return bean;
    }
    // i have a bean facotry that would create my bean
    // bean should have id , name, object
    // who should create the bean?
    // i know the contaienr should manage the bean ordering and updating and 'injecting' ?









}
