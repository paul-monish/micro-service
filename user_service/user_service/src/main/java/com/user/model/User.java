package com.user.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String phone;
    private List<Contact> contact;

    public User(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public User(Long id, String name, String phone, List<Contact> contact) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
