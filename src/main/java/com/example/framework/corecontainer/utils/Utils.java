package com.example.framework.corecontainer.utils;

import java.util.Arrays;

public class Utils {
    public static void printAnnotations(Class<?> clazz){
        Arrays.stream(clazz.getAnnotations()).forEach(item -> {
            String objectString = item.toString();
            System.out.println("Item details: " + objectString);
        });
    }
}
