package ru.rastyapin.crud.dao;

import ru.rastyapin.crud.models.User;

import java.util.List;

public interface UserDAO{
    List<User> index();

    User getUser(long id);
    void save(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
