package com.example.framework.corecontainer.core;

import com.example.framework.corecontainer.ioc.AnnotationMetadataRegistry;
import com.example.framework.corecontainer.ioc.ComponentScanner;
import com.example.framework.corecontainer.ioc.zpringbeans.DefaultBeanFactory;

public class ConfigurableApplicationContext {
    public void run() {
        var componentScanner = new ComponentScanner();
        componentScanner.scan();

        //var x = componentScanner.annotationMetadataByClass.getAnnotationMetadataByClass(UserService.class);
        var annotationMetadataRegistry = new AnnotationMetadataRegistry(componentScanner.getAnnotationMetadataByClass());
        var defaultBeanFactory = new DefaultBeanFactory(annotationMetadataRegistry.beanDefinition);



    }
}
