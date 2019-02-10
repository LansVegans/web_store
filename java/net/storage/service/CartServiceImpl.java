package net.storage.service;

import net.storage.dao.CartDao;
import net.storage.entities.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDao cartDao;

    @Override
    public void save(Cart cart) {
        cartDao.save(cart);
    }
}
