package com.example.demo004.repository;

import com.example.demo004.entities.Payments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PaymentsRepository extends CrudRepository<Payments, String> {
    List<Payments> findAll();

    @Query(value = "SELECT MIN(o.id) as id, o.\"user\" AS user, SUM(p.price) AS amount\n" +
            "\tFROM public.orders o, public.products p\n" +
            "\tWHERE o.drink=p.drink_name AND o.size=p.size\n" +
            "\tGROUP BY o.user;", nativeQuery = true)
    List<Payments> findTotalAmount();

    @Query(value = "SELECT a.id AS id, a.user AS user, a.price as amount, (b.price - a.price) AS owe\n" +
            "FROM\n" +
            "(SELECT MIN(public.payments.id) as id, public.payments.user AS user, SUM(amount) as price\n" +
            "\tFROM public.payments\n" +
            "\tGROUP BY payments.user) AS a,\n" +
            "(SELECT MIN(o.id) as id, o.\"user\" AS user, SUM(p.price) AS price\n" +
            "\tFROM public.orders o, public.products p\n" +
            "\tWHERE o.drink=p.drink_name AND o.size=p.size\n" +
            "\tGROUP BY o.user) AS b\n" +
            "WHERE a.user=b.user;", nativeQuery = true)
    List<Payments> findOwes();
}
