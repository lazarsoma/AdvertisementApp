package com.lazarsoma.advertisement.model;

import javax.persistence.*;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="advertisement_id")
  Advertisement advertisement;

  public User() {
  }

  public User(String name, Advertisement advertisement) {
    this.name = name;
    this.advertisement = advertisement;
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

  public Advertisement getAdvertisement() {
    return advertisement;
  }

  public void setAdvertisement(Advertisement advertisement) {
    this.advertisement = advertisement;
  }
}