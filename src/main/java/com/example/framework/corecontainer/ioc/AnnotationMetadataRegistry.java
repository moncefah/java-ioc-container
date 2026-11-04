package com.example.framework.corecontainer.ioc;

import com.example.framework.corecontainer.ioc.zpringbeans.BeanDefinition;

public class AnnotationMetadataRegistry {
    public final BeanDefinition beanDefinition;


    public AnnotationMetadataRegistry(AnnotationMetadataByClass annotationMetadataByClass){
        this.beanDefinition = new BeanDefinition(annotationMetadataByClass);
    }


}
