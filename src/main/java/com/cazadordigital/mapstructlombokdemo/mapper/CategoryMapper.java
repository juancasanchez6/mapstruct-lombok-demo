package com.cazadordigital.mapstructlombokdemo.mapper;

import com.cazadordigital.mapstructlombokdemo.dto.GetCategory;
import com.cazadordigital.mapstructlombokdemo.entity.Category;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  public CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

  @Mappings({
      @Mapping(source = "id", target = "categoryId"),
      @Mapping(source = "name", target = "categoryName"),
      @Mapping(source = "status", target = "status")
  })

  GetCategory toGetCategory(Category category);

  @InheritInverseConfiguration
  Category toEntity(GetCategory getCategory);

  List<GetCategory> toGetCategoryList(List<Category> categoryList);

  List<Category> toEntityList(List<GetCategory> getCategoryList);

}
