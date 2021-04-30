package com.pawan.RESTfulAPI;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    List<User> users = Arrays.asList(
            new User(1,"pawan","java"),
            new User(2,"aditya","python"),
            new User(3,"priyanshu","react js")
    );

    public List<User> allUsers(){
        return users;
    }
}
