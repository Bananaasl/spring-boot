package ru.Aslanov.spring_boot.service;


import ru.Aslanov.spring_boot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(int id);
    void save(User user);
    void update(User user, int id);
    void delete(int id);

}
