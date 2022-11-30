package com.tam.pop.repository;

import com.tam.pop.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AdminRepositoryInterface {
    Optional<Admin> findById(int id);
    Admin findByUserName(String username);

    public Admin save(Admin admin);

}
