package ru.politova.SpringBootApp.service;

import ru.politova.SpringBootApp.model.User;

import java.util.List;


public interface UserService {
    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> listUsers();

}
