package by.vduzh.gradle.service;

import by.vduzh.gradle.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void findAll() {
        List<User> actual = userService.findAll();
        assertEquals(2, actual.size());
    }
}