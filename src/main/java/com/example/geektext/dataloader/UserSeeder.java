/**
 * @author : dremurguido
 * @created : 2021-01-27
**/
package com.example.geektext.dataloader;
import com.github.javafaker.Faker;

import org.springframework.core.annotation.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

import com.example.geektext.repository.UserRepository;

@Component
@Order(2)
public class UserSeeder implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(UserSeeder.class);

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(ApplicationArguments args) {
    // logger.info("UserSeeder is running........");
    // Faker faker = new Faker();
    // int NUM_USERS = 20;

    // userRepository.deleteAll();

    // for (int i = 0; i < NUM_USERS; i++) {
    //   User user = new User();
    //   user.setName(faker.name().firstName());
    //   user.setEmail(faker.internet().emailAddress());
    //   user.setPassword(faker.internet().password());
    //   userRepository.save(user);
    // }
  }
}
