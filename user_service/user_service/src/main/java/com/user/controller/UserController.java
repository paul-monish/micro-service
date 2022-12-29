package com.user.controller;

import com.user.model.Contact;
import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService us;
    @Autowired
    RestTemplate rt;
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User user=us.getUserById(id);
//        List contact=rt.getForObject("http://localhost:9002/contact/user/"+user.getId(), List.class);
        List contact=rt.getForObject("http://contact-service/contact/user/"+user.getId(), List.class);
        user.setContact(contact);
        return user;
    }
}
