package com.example.WebServicesProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebServicesProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
        

