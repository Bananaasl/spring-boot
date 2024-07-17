package ru.Aslanov.spring_boot.dao;



import ru.Aslanov.spring_boot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<User> findAll();
    Optional<User> findById(int id);
    void save(User user);
    void update(User user, int id);
    void delete(int id);

}
