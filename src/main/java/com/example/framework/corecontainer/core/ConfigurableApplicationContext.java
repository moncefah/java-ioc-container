package com.example.framework.corecontainer.core;

import com.example.framework.corecontainer.ioc.AnnotationMetadataRegistry;
import com.example.framework.corecontainer.ioc.ComponentScanner;
import com.example.framework.corecontainer.ioc.zpringbeans.DefaultBeanFactory;

import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

public class ConfigurableApplicationContext {
    public void run() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, URISyntaxException {
        var componentScanner = new ComponentScanner();
        componentScanner.scan();
        var annotationMetadataRegistry = new AnnotationMetadataRegistry(componentScanner.getAnnotationMetadataByClass());
        var defaultBeanFactory = new DefaultBeanFactory(annotationMetadataRegistry.beanDefinitionRegistry);
    }
}
