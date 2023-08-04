package com.example.main.controller;

import com.example.main.exception.AdminNotFoundException;
import com.example.main.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getAdminInfo(@PathVariable Integer id) {
        if (id == 3333) {
            Contact contact = new Contact("ariful15-11556@diu.edu.bd", +88014454);
            return new ResponseEntity<>(contact, HttpStatus.OK);
        } else {
            throw new AdminNotFoundException("Contact not found");
        }
    }

    @GetMapping("/some-method")
    public ResponseEntity<Object> someMethod() {
        throw new ArithmeticException("Error");
    }

}

