package com.tam.pop.auth;

import com.tam.pop.model.Admin;
import com.tam.pop.repository.AdminRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AdminRepositoryInterface repositoryInterface;

    public UserDetailsServiceImpl(AdminRepositoryInterface repositoryInterface) {
        this.repositoryInterface = repositoryInterface;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin user = repositoryInterface.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User "+user +" not fount");
        }

        return (UserDetails) user;
    }
    private String getUserRole(int roleId) {
        String role = null;
        switch (roleId) {
            case 1:
                role = "ADMIN";
                break;
            case 2:
                role = "USER";
                break;

        }
        return role;
    }
}
