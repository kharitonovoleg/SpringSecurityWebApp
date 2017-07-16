package by.kharitonov.springsecurity.dao;

import by.kharitonov.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kharitonov Oleg on 16.07.2017.
 */

public interface RoleDao extends JpaRepository<Role, Long> {
}