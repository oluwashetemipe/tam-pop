package com.tam.pop.auth;

import com.tam.pop.repository.AdminRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends UserDetailsServiceImpl{
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    public WebSecurityConfig(AdminRepositoryInterface repositoryInterface) {
        super(repositoryInterface);
    }
}
