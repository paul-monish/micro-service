package com.contact.service;

import com.contact.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContactByUserId(Long id);
}
