package com.bablesh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bablesh.helper.Helper;



@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
   // user dashbaord page
    @PostMapping("/dashboard")
    public String userDashboard() {
        System.out.println("User dashboard");
        return "user/dashboard";
    }

     // user profile page
    @GetMapping("/profile")
    public String userProfile(Authentication authentication) {
        String username = Helper.getEmailOfLoggedInUser(authentication);

        logger.info("User logged in : {}",username);
        System.out.println("User profile");
        return "user/profile";
    }
    
    // user add contacts page

    // user view contacts

    // user edit contact

    // user delete contact
    
}
