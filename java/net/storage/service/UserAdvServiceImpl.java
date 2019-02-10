package net.storage.service;

import net.storage.dao.UserAdvDao;
import net.storage.entities.UserAdv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserAdvServiceImpl implements UserAdvService {

    @Autowired
    UserAdvDao userAdvDao;


    @Override
    public void save(UserAdv userAdv) {
        userAdvDao.save(userAdv);
    }
}
