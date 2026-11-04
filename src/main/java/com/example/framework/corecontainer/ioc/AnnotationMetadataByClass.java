package com.example.framework.corecontainer.ioc;

import com.example.framework.app.service.UserService;

import java.lang.annotation.Annotation;
import java.util.*;
import java.util.function.Function;

public class AnnotationMetadataByClass {
    public record  ClassMetaData(Class<?> clazz, List<Annotation> annotationList){}
    public List<ClassMetaData>
            annotationMetadataByClass = new ArrayList<>();
    public void appendClassMetaData(Class<?> clazz){
        var classMetaData = new ClassMetaData(clazz, Arrays.stream(clazz.getAnnotations()).toList());
        this.annotationMetadataByClass.add(classMetaData);
    }

    public  List<Class<?>> getClassesByPresentAnnotaion(Class<? extends Annotation> classAnnotaion){
        return this.annotationMetadataByClass.stream()
                .<Class<?>>map(ClassMetaData::clazz)
                .filter(clazz -> clazz.isAnnotationPresent(classAnnotaion))
                .toList();
    }
}
