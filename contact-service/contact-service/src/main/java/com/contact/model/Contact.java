package com.contact.model;

public class Contact {
    private Long id;
    private String name;
    private String phone;
    private Long user_id;

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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Contact(long id, String name, String phone, long user_id) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.user_id = user_id;
    }
}
