package com.tam.pop;

import com.tam.pop.model.User;
import com.tam.pop.repository.UserRepoInterfaceImpl;
import com.tam.pop.service.UserService;
import com.tam.pop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PopApplication {
	@Autowired
	UserServiceImpl userService;

	public static void main(String[] args) {
		SpringApplication.run(PopApplication.class, args);
	}
	@PostConstruct
	public void postConstruct(){
		userService.save(new User(1,"Akaka","Female"));
	}
}

