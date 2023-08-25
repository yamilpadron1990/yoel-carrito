package com.yoelhcamejo.tiendaonline.app.service;

import com.yoelhcamejo.tiendaonline.app.persistence.dao.RoleRepository;
import com.yoelhcamejo.tiendaonline.app.persistence.dao.UserRepository;
import com.yoelhcamejo.tiendaonline.app.persistence.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveRegisteredUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByID(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
