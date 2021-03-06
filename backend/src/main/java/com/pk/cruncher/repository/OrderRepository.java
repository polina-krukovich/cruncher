package com.pk.cruncher.repository;

import com.pk.cruncher.entity.Order;
import com.pk.cruncher.entity.type.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    @Query("select max(receiptNumber) from orders")
    Optional<Long> findMaxReceiptNumber();

    List<Order> findAllByStatusOrderByCreatedAt(OrderStatus orderStatus);
}
