package com.tam.pop.service;

import com.tam.pop.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;
//@Service
public interface UserService {
    User save(User user);
    Optional<User> findById(Integer id);
}
