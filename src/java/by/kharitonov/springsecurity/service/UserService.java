package by.kharitonov.springsecurity.service;

import by.kharitonov.springsecurity.model.User;

/**
 * Created by Kharitonov Oleg on 16.07.2017.
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
