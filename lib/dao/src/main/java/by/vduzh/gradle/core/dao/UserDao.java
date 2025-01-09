package by.vduzh.gradle.core.dao;

import java.util.List;
import by.vduzh.gradle.core.model.User;

public class UserDao {
    public List<User> findAll() {
        return List.of(new User(1, "admin"), new User(2, "user"));
    }
}
