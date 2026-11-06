package com.example.framework.corecontainer.ioc;

import com.example.framework.corecontainer.ioc.zpringbeans.BeanDefinitionRegistry;

public class AnnotationMetadataRegistry {
    public final BeanDefinitionRegistry beanDefinitionRegistry;


    public AnnotationMetadataRegistry(AnnotationMetadataByClass annotationMetadataByClass){
        this.beanDefinitionRegistry = new BeanDefinitionRegistry(annotationMetadataByClass);
    }


}
