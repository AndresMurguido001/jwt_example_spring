/**
 * @author : dremurguido
 * @created : 2021-01-27
**/
package com.example.geektext.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import com.example.geektext.data.User;
import com.example.geektext.repository.UserRepository;


@Controller 
@RequestMapping("/users")
public class UsersController {


  @Autowired
  private UserRepository userRepo;

  @PostMapping("/create")
  public ResponseEntity<String> create(@RequestBody User user) {

    userRepo.save(user);
    return ResponseEntity.ok("User created");
  }
  
  @GetMapping("/private")
  public ResponseEntity<String> whoami() {
    return ResponseEntity.ok("PRIVATE PAGE");
  }
  
}

