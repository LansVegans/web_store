package net.storage.dao;

import net.storage.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderDao extends JpaRepository<Order,Long> {
    List<Order> findAll();
}
