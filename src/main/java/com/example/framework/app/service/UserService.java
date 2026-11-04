package com.example.framework.app.service;

import com.example.framework.corecontainer.annotations.Component;
import com.example.framework.corecontainer.annotations.Service;

@Component
@Service
public class UserService {
    public UserService() {
        IO.println("User Service is created");
    }
}
