package com.example.geektext.service;

import java.util.Optional;

import com.example.geektext.data.User;
import com.example.geektext.repository.UserRepository;
import com.example.geektext.security.CustomUserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  private UserRepository userRepository;

  public JwtUserDetailsService(UserRepository userRepo) {
    this.userRepository = userRepo;
  }

  @Override
  public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Optional<User> user = userRepository.findByEmail(email);
    if (user != null) {
      User foundUser = user.get();
      return CustomUserDetails.create(foundUser);
    } else {
      throw new UsernameNotFoundException("User not found with email: " + email);
    }
  }
}
