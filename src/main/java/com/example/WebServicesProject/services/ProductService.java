package com.example.WebServicesProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebServicesProject.entities.Product;
import com.example.WebServicesProject.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product FindById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}