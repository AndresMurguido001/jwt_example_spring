/**
 * @author : dremurguido
 * @created : 2021-01-29
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

import com.example.geektext.repository.BookRepository;

@Component
@Order(1)
public class BookSeeder implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(BookSeeder.class);

  @Autowired
  private BookRepository bookRepository;

  @Override
  public void run(ApplicationArguments args) {
    // logger.info("BookSeeder is running.......");
    // Faker faker = new Faker();

    // bookRepository.deleteAll();

    // for (int i = 0; i < 20; i++) {

    //   int numAuthors = generateRandomNumber(1, 3);

    //   String title = faker.book().title();
    //   String genre = faker.book().genre();
    //   Book book = new Book();
    //   book.setTitle(title);
    //   book.setGenre(genre);
    //   /**
    //    * Assign a random number of authors
    //    */
    //   for (int j = 0; j < 1; j++) {
    //     String firstName = faker.name().firstName();
    //     String lastName = faker.name().lastName();

    //     Author newAuthor = new Author();
    //     newAuthor.setFirstName(firstName);
    //     newAuthor.setLastName(lastName);
        
    //     newAuthor.getBooks().add(book);
    //     book.getAuthors().add(newAuthor);
    //   }

    //     bookRepository.save(book);
      
    // }
  }


  // private Integer generateRandomNumber(Integer min, Integer max) {
  //   return (int)( Math.random() * (max - min + 1) + min);
  // }
}
