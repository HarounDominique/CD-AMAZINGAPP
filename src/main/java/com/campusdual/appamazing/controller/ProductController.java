package com.campusdual.appamazing.controller;

import com.campusdual.appamazing.api.IProductsService;
import com.campusdual.appamazing.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductsService productsService;

    @PostMapping
    public String testController(@RequestBody String name){
        return "Products controller works, "+name+"!" ;
    }

    @PostMapping("/get")
    public ProductDto queryProduct(@RequestBody ProductDto productDto){
        return this.productsService.queryProduct(productDto);
    }

    @GetMapping("/get/{id}")
    public ProductDto queryProduct(@PathVariable int id){
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        return this.productsService.queryProduct(productDto);
    }

    @GetMapping("/getall")
    public List<ProductDto> queryAllProducts(){
        return this.productsService.queryAllProducts();
    }

    @PostMapping("/add")
    public int addProduct(@RequestBody ProductDto productDto){
        return this.productsService.insertProduct(productDto);
    }

    @PutMapping("/update")
    public int updateProduct(@RequestBody ProductDto productDto){
        return this.productsService.updateProduct(productDto);
    }

    @DeleteMapping("/delete")
    public int deleteProduct(@RequestBody ProductDto productDto){
        return this.productsService.deleteProduct(productDto);
    }
}
