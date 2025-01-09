package by.vduzh.gradle.app.libjar;

import by.vduzh.gradle.model.User;
import by.vduzh.gradle.service.UserService;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> all = userService.findAll();
        System.out.println(Arrays.toString(all.toArray()));
    }
}
