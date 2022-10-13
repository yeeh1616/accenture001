package com.example.demo004.repository;

import com.example.demo004.entities.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProductsRepository extends CrudRepository<Products, String> {
    List<Products> findAll();
}
