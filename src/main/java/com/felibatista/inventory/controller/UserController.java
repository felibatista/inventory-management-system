package com.felibatista.inventory.controller;

import com.felibatista.inventory.entity.User;
import com.felibatista.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    public UserService getCustomerService() {
        return userService;
    }

    @GetMapping("/b")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/a")
    public Iterable<User> findAllGlobal(){
        return userService.findAll();
    }

}
