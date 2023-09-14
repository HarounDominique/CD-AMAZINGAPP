package com.campusdual.appamazing.service;

import com.campusdual.appamazing.api.IProductsService;
import com.campusdual.appamazing.model.Product;
import com.campusdual.appamazing.model.dao.ProductDao;
import com.campusdual.appamazing.model.dto.ProductDto;
import com.campusdual.appamazing.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
@Lazy
public class ProductService implements IProductsService {
    @Autowired
    private ProductDao productDao;

//    @Autowired
//    public ProductService (ProductDao productDao){
//        this.productDao = productDao;
//    }

    @Override
    public ProductDto queryProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        return ProductMapper.INSTANCE.toDTO(productDao.getReferenceById(product.getId()));
    }

    @Override
    public List<ProductDto> queryAllProducts() {
        return ProductMapper.INSTANCE.toDTOList(productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        productDao.saveAndFlush(product);
        return product.getId();
    }

    @Override
    public int updateProduct(ProductDto productDto) {
        return this.insertProduct(productDto);
    }

    @Override
    public int deleteProduct(ProductDto productDto) {
        int id = productDto.getId();
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        productDao.delete(product);
        return id;
    }
}
