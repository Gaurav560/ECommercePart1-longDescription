package com.telusko.service;

import com.telusko.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    //  Product createProduct(Product product) throws Exception;
    List<Product> getAllProducts();

    Optional<Product> getProductById(int id);
}
