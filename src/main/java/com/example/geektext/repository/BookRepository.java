/**
 * @author : dremurguido
 * @created : 2021-01-29
**/
package com.example.geektext.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.geektext.data.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {

}
