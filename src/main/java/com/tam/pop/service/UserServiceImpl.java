package com.tam.pop.service;

import com.tam.pop.model.User;
import com.tam.pop.repository.UserRepoInterfaceImpl;
import com.tam.pop.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepositoryInterface repoInterface;

    public Optional<User> findById(Integer id){
        return repoInterface.findById(id);
    }

    public User save(User user){
        return repoInterface.save(user);
    }

}
