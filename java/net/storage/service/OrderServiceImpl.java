package net.storage.service;

import net.storage.dao.OrderDao;
import net.storage.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class OrderServiceImpl implements OrderSevice {

    @Autowired
    OrderDao orderDao;

    @Override
    public List<Order> getAll() {
        return orderDao.findAll();
    }
}
