package com.example.framework.corecontainer.ioc.zpringbeans;

import com.example.framework.corecontainer.annotations.Component;
import com.example.framework.corecontainer.ioc.AnnotationMetadataByClass;

import java.util.ArrayList;
import java.util.List;

public class BeanDefinitionRegistry {
    private List<Class<?>> beanDefinitionList = new ArrayList<>();
    public BeanDefinitionRegistry(AnnotationMetadataByClass annotationMetadataByClass){
       populateBeanRegistry(annotationMetadataByClass);
       printBeansDefinition();
    }
    public void populateBeanRegistry(AnnotationMetadataByClass annotationMetadataByClass){
        for (var clazz: annotationMetadataByClass.getClassesByPresentAnnotaion(Component.class)){
            this.beanDefinitionList.add(clazz);
        }
    }

    public void printBeansDefinition(){
        for (var beanDefinition: beanDefinitionList){
            System.out.println(beanDefinition.toString());
        }
    }

    public List<Class<?>> getBeanDefinitionList() {
        return beanDefinitionList;
    }
    // i have a class that holds registrys (R1, R2, R3) each one with it special method of creation
    // each registry has some specific details to get initiated
    // i want to call inside the constructor of the class that holds these registrie and it calls some how a method or a constructor of that Class that should handle that specif registry
    // but how the registry got updated ?:
    // either i can pass it in the parameter? but how
    // either i have a common method that would be the same a cross all registry holders : instinitate()

    /*
    Example:
    CLASS 1: REGISTRY HOLDER (RH) it has BEAN REGISTRY: BR, SERVICES REGISTRY: SR
    CLASS 2: BEAN Definition it has the method that would instinte the BR








     */

}
