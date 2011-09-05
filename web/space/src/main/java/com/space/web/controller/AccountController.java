package com.space.web.controller;

import com.space.domain.User;
import com.space.repository.mongo.UserRepository;
import com.space.domain.User;
import com.space.security.services.UserDetailsService;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Controller
@RequestMapping(value="/account")
public class AccountController {
    @Inject
    UserDetailsService userDetailsService;
    
    @RequestMapping(method= RequestMethod.GET,value="/login")
	public void login() {
	}
    @RequestMapping(method= RequestMethod.GET,value="/register")
	public String register() {
        return "/account/register";
	}
    @RequestMapping(method= RequestMethod.POST,value="/create")
	public String create(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {
        String roleName = "user";
        System.out.println(
                "[User Name:" + username + ",password:" + password + ",role:" + roleName + "]");
        List<String> roles = new ArrayList<String>();
        roles.add(roleName);
        userDetailsService.createUser(username,password,roles);
        return "redirect:/account/login";
	}
    @RequestMapping(method= RequestMethod.GET,value="/access-denied")
	public String accessDenied() {
        return "/account/access-denied";
	}
    
}
