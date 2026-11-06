package com.example.framework.corecontainer.ioc;

import com.example.framework.corecontainer.ioc.zpringbeans.Bean;

import java.util.*;

public class Container {
    private Set<Bean> iocContainer = new HashSet<>();
    private static int idCounter = 0;

    public Set<Bean> getIocContainer() {
        return iocContainer;
    }

    public void setIocContainer(Set<Bean> iocContainer) {
        this.iocContainer = iocContainer;
    }
    public void appendBean(Bean bean){
        idCounter++;
        this.iocContainer.add(bean);
    }

    public static int getIdCounter() {
        return idCounter;
    }
}
