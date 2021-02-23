package com.example.geektext.config;

import javax.persistence.PrePersist;

import com.example.geektext.data.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BeforeSaveEvent {
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PrePersist
    public void encodePassword(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    }
}
