package com.cazadordigital.mapstructlombokdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "product")
public class Product {

  @Id
  private long id;

  private String name;

  @Column(name = "creation_date")
  private LocalDateTime creationDate;

  private BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

}
