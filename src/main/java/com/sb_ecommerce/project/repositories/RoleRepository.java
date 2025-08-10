package com.sb_ecommerce.project.repositories;

import com.sb_ecommerce.project.model.AppRole;
import com.sb_ecommerce.project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
