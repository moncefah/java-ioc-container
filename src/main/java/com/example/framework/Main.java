package com.example.framework;

import com.example.framework.app.service.UserService;
import com.example.framework.corecontainer.core.ConfigurableApplicationContext;


public class Main{
    public static void main() {

        UserService userService = new UserService();
        var configurableApplicationContext = new ConfigurableApplicationContext();
        configurableApplicationContext.run();
    }
}


