package com.example.main.model;

public class Contact {
    private String email;
    private Integer number;

    public Contact(String email, Integer number) {
        this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
