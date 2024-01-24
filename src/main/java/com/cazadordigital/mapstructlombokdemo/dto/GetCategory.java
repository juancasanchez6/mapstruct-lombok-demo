package com.cazadordigital.mapstructlombokdemo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GetCategory {

  private long categoryId;

  private String categoryName;

  private boolean status;

}
