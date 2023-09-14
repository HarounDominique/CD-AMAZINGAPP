package com.campusdual.appamazing.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/products")
public class ProductController {
    
    @PostMapping
    public String testController(@RequestBody String name){
        return "Products controller works, "+name+"!" ;
    }
}
