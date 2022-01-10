package com.barralagart.course.services;

import java.util.List;
import java.util.Optional;

import com.barralagart.course.entities.Category;
import com.barralagart.course.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> category = repository.findById(id);
        return category.get();
    }

}
