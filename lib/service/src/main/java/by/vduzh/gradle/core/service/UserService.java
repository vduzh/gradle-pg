package by.vduzh.gradle.core.service;

import by.vduzh.gradle.core.dao.UserDao;
import by.vduzh.gradle.core.model.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

   public List<User> getAll() {
       return userDao.findAll();
   }
}
