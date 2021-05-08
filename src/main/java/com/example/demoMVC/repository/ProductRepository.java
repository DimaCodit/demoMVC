package com.example.demoMVC.repository;

import com.example.demoMVC.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {

    private final static List<Product> database = new ArrayList<>();

    static {
        database.add(new Product("1", "Сникерс", 50));
        database.add(new Product("1", "Марс", 45));
        database.add(new Product("1", "Баути", 55));
    }

    public void add(Product product) {
        database.add(product);
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(database);
    }

}
