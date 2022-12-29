package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> contacts=List.of(
            new Contact(1L,"shilpa","123456",1L),
            new Contact(2L,"saikat","123456",1L),
            new Contact(3L,"rudra","123456",2L),
            new Contact(4L,"aniket","123456",2L),
            new Contact(5L,"ishika","123456",3L)
    );
    @Override
    public List<Contact> getContactByUserId(Long id) {
        return contacts.stream().filter(c->c.getUser_id().equals(id)).collect(Collectors.toList());
    }
}
