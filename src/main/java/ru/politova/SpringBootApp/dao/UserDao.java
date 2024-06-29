package ru.politova.SpringBootApp.dao;



import ru.politova.SpringBootApp.model.User;

import java.util.List;



public interface UserDao {
    List<User> listUsers();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
