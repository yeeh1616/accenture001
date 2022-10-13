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
public class PaymentsController {
    private final PaymentsRepository paymentsRepository;

    @Autowired
    public PaymentsController(PaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }

    // Amount paid per user
    @GetMapping(value = "/payments")
    public ResponseEntity<Object> getPayments() {
        List<Payments> payments = this.paymentsRepository.findOwes();
        return ResponseEntity.ok(payments);
    }

    // Amount that each users still owes
    @GetMapping(value = "/owes")
    public ResponseEntity<Object> getOwes() {
        List<Payments> payments = this.paymentsRepository.findOwes();
        return ResponseEntity.ok(payments);
    }
}
