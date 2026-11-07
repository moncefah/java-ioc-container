package com.example.framework.corecontainer.ioc;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class ComponentScanner {

    public AnnotationMetadataByClass annotationMetadataByClass = new AnnotationMetadataByClass();


    public void scan() throws URISyntaxException {
        var path = "com/example/framework/app/";
        var classesPathsList = new ArrayList<String>();
        findClassPathsInPackage(path, classesPathsList);
        var classes = loadClassesFromPathes(classesPathsList);
        for(var clazz: classes){
            annotationMetadataByClass.appendClassMetaData(clazz);
        }
    }
    private List<Class<?>>loadClassesFromPathes(List<String> absoluteClassesPaths){
        return  absoluteClassesPaths.stream()
                .map(absouluteclassPath -> getClassPathFromAbsolutePath(absouluteclassPath) )
                .<Class<?>>map(classPath -> {
                    try {
                        return Class.forName(classPath);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();
    }

    private  void findClassPathsInPackage(String path, List<String> result) throws URISyntaxException {
        var packagePath = path.replace(".","/");
        var classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(packagePath);
        File dir = new File(url.toURI());
        readDirectory(dir.listFiles(), result);
    }
    public  void readDirectory(File[] listFiles, List<String> result) throws URISyntaxException {
        for (File file : listFiles) {
            if(file.isDirectory()){
                findClassPathsInPackage(sliceFromCom(file.toString()), result);
            }
            else {
                result.add(file.toString());
            }
        }
    }
    private String sliceFromCom(String string){
        int indexOfCom = string.indexOf("com");
        String s = string.substring(indexOfCom);
        return s;
    }
    public String getClassPathFromAbsolutePath(String absolutePath){
        var s = absolutePath;
        s = sliceFromCom(s);
        s = s.replace("/",".");
        s = s.substring(0, s.length()-6);
        return s;
    }

    public AnnotationMetadataByClass getAnnotationMetadataByClass() {
        return annotationMetadataByClass;
    }
}
