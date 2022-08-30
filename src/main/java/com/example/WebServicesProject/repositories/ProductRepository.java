package com.example.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebServicesProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
        

