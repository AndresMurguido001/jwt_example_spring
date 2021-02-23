package com.example.geektext.controllers;

import java.util.Optional;

import javax.transaction.Transactional;

import com.example.geektext.data.*;
import com.example.geektext.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javassist.NotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/books")
public class BooksController {


    @Autowired
    private BookRepository bookRepository;

    @PostMapping(value="/create")
    public ResponseEntity<Book> createBook(@RequestBody Book entity) {

        bookRepository.save(entity);
        
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) throws NotFoundException{
        Book selectedBook = bookRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Not Found"));

        return ResponseEntity.ok(selectedBook);
    }
    
    
}
