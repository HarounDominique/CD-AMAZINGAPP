package com.campusdual.appamazing.model.dao;

import com.campusdual.appamazing.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
