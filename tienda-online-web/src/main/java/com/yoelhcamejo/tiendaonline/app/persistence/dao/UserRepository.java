package com.yoelhcamejo.tiendaonline.app.persistence.dao;

import com.yoelhcamejo.tiendaonline.app.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
