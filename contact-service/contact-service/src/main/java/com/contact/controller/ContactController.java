package com.contact.controller;

import com.contact.model.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService cs;
    @GetMapping("user/{user_id}")
    public List<Contact> getContactByUserId(@PathVariable("user_id") Long user_id){
        return cs.getContactByUserId(user_id);
    }
}

