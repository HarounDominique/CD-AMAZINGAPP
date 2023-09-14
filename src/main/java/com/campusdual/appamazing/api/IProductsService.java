package com.campusdual.appamazing.api;

import com.campusdual.appamazing.model.dto.ProductDto;

import java.util.List;

public interface IProductsService {
    ProductDto queryProduct(ProductDto productDto);

    List<ProductDto> queryAllProducts();

    int insertProduct(ProductDto productDto);

    int updateProduct(ProductDto productDto);

    int deleteProduct(ProductDto productDto);

}
