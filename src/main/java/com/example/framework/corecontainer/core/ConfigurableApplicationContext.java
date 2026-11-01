package com.example.framework.corecontainer.core;

import com.example.framework.corecontainer.annotations.Component;
import com.example.framework.corecontainer.ioc.ComponentScanner;

public class ConfigurableApplicationContext {
    public void run() {
        var componentScanner = new ComponentScanner();
        componentScanner.scan();
    }
}
