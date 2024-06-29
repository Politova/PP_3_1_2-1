package ru.politova.SpringBootApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.politova.SpringBootApp.dao.UserDao;
import ru.politova.SpringBootApp.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(int id) {
        return userDao.show(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.update(user.getId(), user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
