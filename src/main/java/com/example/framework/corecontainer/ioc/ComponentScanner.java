package com.example.framework.corecontainer.ioc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.stream.Collectors;

public class ComponentScanner {

    public AnnotationMetadataByClass annotationMetadataByClass = new AnnotationMetadataByClass();


    public void scan(){
        var classes = getListOfAllClasses();
        classes.forEach(clazz ->{
            annotationMetadataByClass.appendClassMetaData(clazz);
        });
    }


    private Set<Class<?>> getListOfAllClasses(){
        Set<Class<?>> classes = new HashSet<>();
        Package[] pa = Package.getPackages();
        for (Package p : pa) {
            if (p.getName().contains("com.example.framework.app")) {
                classes.addAll(getListOfClassesFromPackage(p.getName()));
            }
        }
        return classes;
    }

    private Set getListOfClassesFromPackage(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private Class getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            IO.println("No class found");
        }
        return null;
    }
    private List<Annotation> getAnnotations(Class clazz){
        return List.of(clazz.getAnnotations());
    }

    public AnnotationMetadataByClass getAnnotationMetadataByClass() {
        return annotationMetadataByClass;
    }
}
