/**
 * @author : dremurguido
 * @created : 2021-01-29
**/
package com.example.geektext.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.geektext.data.Author;


public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
