package com.example.framework;

import com.example.framework.app.service.UserService;
import com.example.framework.corecontainer.annotations.Component;
import com.example.framework.corecontainer.core.ConfigurableApplicationContext;

import java.util.function.Function;




public class Main{


    public static void main() {

          UserService userService = new UserService();
          var configurableApplicationContext = new ConfigurableApplicationContext();
          try {
              configurableApplicationContext.run();

          }
          catch (Exception _){
              IO.println("Failed Start");
          }

    }
}


