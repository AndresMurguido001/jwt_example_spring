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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;




@Entity 
public class Book {
 
  @Id
  @Column(name = "book_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  @JoinTable(
    name = "books_authors",
    joinColumns = {
      @JoinColumn(name="author_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name="book_id")
    }
  )
  @ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}) // An author is created when book is created
  private Set<Author> authors = new HashSet<>();

  private String title;
  private String genre;

  public String getTitle() {
    return this.title;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setTitle(String _title) {
    this.title = _title;
  }

  public void setGenre(String _genre) {
    this.genre = _genre;
  }

  public Set<Author> getAuthors() {
    return this.authors;
  }

  public void setAuthors(Set<Author> authors) {
    this.authors = authors;
  }


}
 
