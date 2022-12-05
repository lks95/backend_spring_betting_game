package com.example.backendewd.repository;

import java.util.Optional;
import com.example.backendewd.model.AdminUser;
import com.example.backendewd.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(AdminUser name);

    Boolean existsByUsername(String username);

}