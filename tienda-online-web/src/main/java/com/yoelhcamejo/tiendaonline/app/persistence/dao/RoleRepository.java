package com.yoelhcamejo.tiendaonline.app.persistence.dao;

import com.yoelhcamejo.tiendaonline.app.persistence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
