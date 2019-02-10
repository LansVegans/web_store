package net.storage.service;

import net.storage.entities.User;

/**
 * Service class for {@link net.storage.entities.User}
 */
public interface UserService {
    void save (User user);

    User findByUsername(String username);

}
