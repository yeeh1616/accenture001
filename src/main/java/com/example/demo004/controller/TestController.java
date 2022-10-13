package com.example.demo004.controller;

import com.example.demo004.entities.Orders;
import com.example.demo004.entities.Payments;
import com.example.demo004.entities.Products;
import com.example.demo004.repository.OrdersRepository;
import com.example.demo004.repository.PaymentsRepository;
import com.example.demo004.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private final OrdersRepository ordersRepository;
    private final PaymentsRepository paymentsRepository;
    private final ProductsRepository productsRepository;

    @Autowired
    public TestController(OrdersRepository ordersRepository, PaymentsRepository paymentsRepository, ProductsRepository productsRepository) {
        this.ordersRepository = ordersRepository;
        this.paymentsRepository = paymentsRepository;
        this.productsRepository = productsRepository;
    }

    @GetMapping(value = "/orders")
    public ResponseEntity<Object> getOrders() {
        List<Orders> orders = this.ordersRepository.findAll();
        return ResponseEntity.ok(orders);
    }

    @GetMapping(value = "/payments")
    public ResponseEntity<Object> getPayments() {
//        List<Payments> payments = this.paymentsRepository.findAll();
//        List<Payments> payments2 = this.paymentsRepository.findTotalAmount();
        List<Payments> payments3 = this.paymentsRepository.findOwes();
        return ResponseEntity.ok(payments3);
    }

    @GetMapping(value = "/products")
    public ResponseEntity<Object> getProducts() {
        List<Products> products = this.productsRepository.findAll();
        return ResponseEntity.ok(products);
    }
}
