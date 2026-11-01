package com.example.framework.corecontainer.ioc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DefaultBeanFactory{

    private final Container container;
    public DefaultBeanFactory(Container container) {
        this.container = container;
    }

    public Object getBean(String name) throws BeansException {
        return null;
    }








}
