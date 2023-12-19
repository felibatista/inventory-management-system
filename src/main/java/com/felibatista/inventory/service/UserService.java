package com.felibatista.inventory.service;

import com.felibatista.inventory.entity.User;
import com.felibatista.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository customerRepository;

    @Autowired
    public UserService(UserRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public UserRepository getCustomerRepository() {
        return customerRepository;
    }

    public User findById(long id){
        return customerRepository.findById(id);
    }

    public Iterable<User> findAll(){
        return customerRepository.findAll();
    }

    public User findByEmail(String email){
        return customerRepository.findByEmail(email).orElseThrow();
    }
}
