package com.cazadordigital.mapstructlombokdemo.test;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cazadordigital.mapstructlombokdemo.dto.GetProduct;
import com.cazadordigital.mapstructlombokdemo.entity.Product;
import com.cazadordigital.mapstructlombokdemo.mapper.ProductMapper;
import com.cazadordigital.mapstructlombokdemo.repository.ProductRepository;

@Configuration
public class InitDatabase {

  @Autowired
  private ProductRepository productRepository;

  private ProductMapper productMapper = ProductMapper.INSTANCE;

  @Bean
  public CommandLineRunner testProductMapperCommand() {
    return args -> {
      List<Product> products = productRepository.findAll();

      System.out.println("PRODUCTS");
      products.forEach(System.out::println);

      System.out.println("Get PRODUCTS");
      List<GetProduct> getProductList = productMapper.toGetProductList(products);
      getProductList.forEach(System.out::println);

      System.out.println("MAPPED PRODUCTS");
      List<Product> mappedProducts = productMapper.toEntityList(getProductList);
      mappedProducts.forEach((System.out::println));

    };
  }

}
