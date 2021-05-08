package com.example.demoMVC.controller;

import com.example.demoMVC.dto.Product;
import com.example.demoMVC.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @ModelAttribute("products")
    public List<Product> showAll(){
        return productService.findAll();
    }

    @PostMapping
    public String add(@ModelAttribute Product product) {
        productService.add(product);
        return "productAdded";
    }

}
