package com.example.framework.corecontainer.ioc;

import com.example.framework.corecontainer.ioc.zpringbeans.Bean;

import java.util.*;

public class Container {
    private Set<Bean> iocContainer = new HashSet<>();

    public Set<Bean> getIocContainer() {
        return iocContainer;
    }

    public void setIocContainer(Set<Bean> iocContainer) {
        this.iocContainer = iocContainer;
    }
    public void appendBean(Bean bean){
        this.iocContainer.add(bean);
    }
}
