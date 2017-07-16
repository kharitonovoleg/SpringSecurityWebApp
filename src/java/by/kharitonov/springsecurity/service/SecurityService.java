package by.kharitonov.springsecurity.service;

/**
 * Created by Kharitonov Oleg on 16.07.2017.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}

