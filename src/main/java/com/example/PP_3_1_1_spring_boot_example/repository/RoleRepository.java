package com.example.PP_3_1_1_spring_boot_example.repository;

import com.example.PP_3_1_1_spring_boot_example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}