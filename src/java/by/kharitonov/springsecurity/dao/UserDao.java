package by.kharitonov.springsecurity.dao;

import by.kharitonov.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kharitonov Oleg on 16.07.2017.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

