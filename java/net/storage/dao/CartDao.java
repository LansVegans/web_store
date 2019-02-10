package net.storage.dao;

import net.storage.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartDao extends JpaRepository<Cart, Long>{

}
