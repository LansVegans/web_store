package net.storage.dao;

import net.storage.entities.UserAdv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserAdvDao extends JpaRepository<UserAdv,Long> {

    @Override
    List<UserAdv> findAll();
}
