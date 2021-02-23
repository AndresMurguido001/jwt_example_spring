/**
 * @author : dremurguido
 * @created : 2021-01-27
**/
package com.example.geektext.data;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.geektext.config.BeforeSaveEvent;

@Entity 
@EntityListeners(BeforeSaveEvent.class)
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;

  @Column(unique = true)
  private String email;

  private String password;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
