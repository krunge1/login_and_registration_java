package com.krunge.loginandregistration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunge.loginandregistration.models.User;
import com.krunge.loginandregistration.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List <User> getAll(){
    	return userRepo.findAll();
    }
    
    public User getOne(Long id) {
    	return userRepo.findById(id).orElse(null);
    }
    	
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
        return null;
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        return null;
    }
}
