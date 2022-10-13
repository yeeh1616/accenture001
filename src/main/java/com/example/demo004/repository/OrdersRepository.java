package com.example.demo004.repository;

import com.example.demo004.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OrdersRepository extends CrudRepository<Orders, String> {
    List<Orders> findAll();
}
