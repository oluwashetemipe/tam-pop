package com.tam.pop.repository;

import com.tam.pop.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoryInterface {

    public User save(User user);
    Optional<User> findById(Integer id);
}
