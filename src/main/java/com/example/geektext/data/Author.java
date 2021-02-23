/**
 * @author : dremurguido
 * @created : 2021-01-29
**/
package com.example.geektext.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Author {

  @Id
  @Column(name="author_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String firstName;

  private String lastName;

  // Mapped By specifies that field in the entity that OWNS the relationship
  @ManyToMany(mappedBy="authors")
  // We ignore the property 'authors' in this set of books to prevent an infinite loop of serialization
  // when we query books.
  @JsonIgnoreProperties("authors")
  private Set<Book> books = new HashSet<>();


  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setFirstName(String _firstName) {
    this.firstName = _firstName;
  }

  public void setLastName(String _lastName){ 
    this.lastName = _lastName;
  }

  public Set<Book> getBooks() {
    return books;
  }

}
