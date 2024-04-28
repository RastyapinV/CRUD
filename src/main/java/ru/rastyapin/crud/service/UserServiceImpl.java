package ru.rastyapin.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rastyapin.crud.dao.UserDAO;
import ru.rastyapin.crud.models.User;

import java.util.List;

@Service(value = "service")
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(@Qualifier("dao") UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public void update(long id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Transactional
    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }
}
