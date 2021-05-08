package com.example.demoMVC.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String title;
    private Integer cost;
}
