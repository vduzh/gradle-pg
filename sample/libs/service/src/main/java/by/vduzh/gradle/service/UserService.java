package by.vduzh.gradle.service;

import by.vduzh.gradle.dao.UserDao;
import by.vduzh.gradle.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> findAll() {
        return userDao.findAll();
    }
}
