package by.vduzh.gradle.dao;

import by.vduzh.gradle.model.User;

import java.util.List;

import static java.util.List.of;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                User.builder().id(1).name("admin").build(),
                User.builder().id(2).name("guest").build()
        );
    }
}
