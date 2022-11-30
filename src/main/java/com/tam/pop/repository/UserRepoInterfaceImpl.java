package com.tam.pop.repository;

import com.tam.pop.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Repository
public class UserRepoInterfaceImpl implements UserRepositoryInterface{

    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private Integer suffix;

    private List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        User existingUser = findById(user.getId()).orElse(null);
        updateInternalId(user);
        if (existingUser == null){
            users.add(user);
        }
        else {
            users.remove(existingUser);
            User newUser = new User(user);
            users.add(newUser);
        }
        return user;
    }

    @Override
    public Optional<User> findById(Integer id) {
        return users.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst();
    }
    private void updateInternalId(User user){
        user.setInternalId(prefix + "-" + user.getId() + suffix);
    }

}
