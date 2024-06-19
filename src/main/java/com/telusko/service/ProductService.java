package com.telusko.service;

import com.telusko.model.Product;

import java.util.List;

public interface ProductService {
    //  Product createProduct(Product product) throws Exception;
    List<Product> getAllProducts();

    Product getProductById(int id);
}
