package com.yoelhcamejo.tiendaonline.app.persistence.dao;

import com.yoelhcamejo.tiendaonline.app.persistence.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
}
