package com.campusdual.appamazing.model.dto.dtomapper;

import com.campusdual.appamazing.model.Product;
import com.campusdual.appamazing.model.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDTO(Product product);

    Product toEntity(ProductDto productDTO);

    List<ProductDto> toDTOList(List<Product> products);

}
