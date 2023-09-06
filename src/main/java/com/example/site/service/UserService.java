package com.example.site.service;


import com.example.site.model.User;
//import com.example.site.repository.UserRepository;
import com.example.site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public void 회원가입(User user) {
        userRepository.save(user);
    }
}
