package com.cazadordigital.mapstructlombokdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Product {

  @Id
  private long id;

  private String name;

  @Column(name = "creation_date")
  private LocalDateTime creationDate;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreationDate() {
    return this.creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id= " + id +
        ", name= '" + name + '\'' +
        ", creationDate= " + creationDate +
        '}';
  }
}