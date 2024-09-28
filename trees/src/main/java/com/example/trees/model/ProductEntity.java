package com.example.trees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
    @Id
    private String productCode;
    private String name;
}
