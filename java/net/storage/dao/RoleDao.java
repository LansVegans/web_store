package net.storage.dao;

import net.storage.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleDao extends JpaRepository<Role, Long> {
}
