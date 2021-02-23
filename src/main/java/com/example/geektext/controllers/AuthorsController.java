package com.example.geektext.controllers;

import com.example.geektext.data.Author;
import com.example.geektext.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javassist.NotFoundException;

@Controller
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Integer id) throws NotFoundException {
        Author selectedAuthor = authorRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Author not found"));

        return ResponseEntity.ok(selectedAuthor);
    }
    
}
