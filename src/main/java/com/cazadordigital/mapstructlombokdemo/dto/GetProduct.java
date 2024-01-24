package com.cazadordigital.mapstructlombokdemo.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GetProduct {

  private long productId;

  private String productName;

  private String creationDate;

  private GetCategory productCategory;

  private String price;

}
