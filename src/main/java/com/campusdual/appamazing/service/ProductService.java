package com.campusdual.appamazing.service;

import com.campusdual.appamazing.api.IProductsService;
import com.campusdual.appamazing.model.dao.ProductDao;
import com.campusdual.appamazing.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
@Lazy
public class ProductService implements IProductsService {
    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDto queryProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public List<ProductDto> queryAllProducts() {
        return null;
    }

    @Override
    public int insertProduct(ProductDto productDto) {
        return 0;
    }

    @Override
    public int updateProduct(ProductDto productDto) {
        return 0;
    }

    @Override
    public int deleteProduct(ProductDto productDto) {
        return 0;
    }
}
