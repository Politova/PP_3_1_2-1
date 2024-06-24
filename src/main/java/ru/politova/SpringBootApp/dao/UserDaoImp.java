package ru.politova.SpringBootApp.dao;


import org.springframework.stereotype.Repository;


import javax.persistence.*;
import ru.politova.SpringBootApp.model.User;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Override
    public User showUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUserById(Long id) {
        entityManager.remove(showUserById(id));
    }

    @Override
    public void updateUserById(Long id, User user) {
        User updateUser = showUserById(id);
        updateUser.setName(user.getName());
        updateUser.setAge(user.getAge());
    }
}
