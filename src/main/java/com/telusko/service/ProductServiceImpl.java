package com.telusko.service;

import com.telusko.model.Product;
import com.telusko.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    //    @Override
//    public Product createProduct(Product product) throws Exception {
//        return productRepo.save(product);
//    }
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

}
