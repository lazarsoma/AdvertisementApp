package com.lazarsoma.advertisement.model;

import javax.persistence.*;

@Entity
public class Advertisement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="user_id")
  private User user;

  public Advertisement() {
  }

  public Advertisement(String name, User user) {
    this.name = name;
    this.user = user;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
