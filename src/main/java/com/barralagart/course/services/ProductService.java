package com.barralagart.course.services;

import java.util.List;
import java.util.Optional;

import com.barralagart.course.entities.Product;
import com.barralagart.course.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
