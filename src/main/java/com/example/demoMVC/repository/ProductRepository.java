package com.example.demoMVC.repository;

import com.example.demoMVC.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private final static List<Product> database = Collections.synchronizedList(new ArrayList<>());

    static {
        database.add(new Product("1", "Сникерс", 50));
        database.add(new Product("2", "Марс", 45));
        database.add(new Product("3", "Баути", 55));
    }

    public void add(Product product) {
        database.add(product);
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(database);
    }

    public Product getById(String id) {
        Optional<Product> product= database.stream().filter(p->p.getId().equals(id)).findFirst();
        return product.get();
    }

}
