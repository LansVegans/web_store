package net.storage.dao;

import net.storage.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
