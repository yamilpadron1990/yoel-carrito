package com.yoelhcamejo.tiendaonline.app.service;

import com.yoelhcamejo.tiendaonline.app.persistence.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();

    void saveRegisteredUser(User user);

    Optional<User> getUserByID(long id);

    void deleteUser(User user);

}
