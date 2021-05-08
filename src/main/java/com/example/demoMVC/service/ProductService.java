package com.example.demoMVC.service;

import com.example.demoMVC.dto.Product;
import com.example.demoMVC.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductService {

    private final ProductRepository productRepository;

    public void add(Product product) {
        log.debug("add product");
        productRepository.add(product);
    }

    public List<Product> findAll() {
        log.debug("find all products");
        return productRepository.findAll();
    }

}
