package ru.politova.SpringBootApp.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.politova.SpringBootApp.dao.UserDao;
import ru.politova.SpringBootApp.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public User showUserById(Long id) {
        return userDao.showUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);

    }

    @Override
    @Transactional
    public void updateUserById(Long id, User user) {
        userDao.updateUserById(id, user);

    }
}
