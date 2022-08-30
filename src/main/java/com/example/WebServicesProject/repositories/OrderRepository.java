package com.example.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebServicesProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
        

