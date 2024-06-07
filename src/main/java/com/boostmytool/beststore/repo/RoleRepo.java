package com.boostmytool.beststore.repo;

import com.boostmytool.beststore.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String name);
}
