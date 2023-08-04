package com.example.main.controller;

import com.example.main.exception.AdminNotFoundException;
import com.example.main.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getProductInfo(@PathVariable Integer id) {
        if (id == 1111) {
            Product product = new Product(2556, "car", "sdgsgsg");
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            throw new AdminNotFoundException("Product Not Found");
        }
    }

    @GetMapping("/some-method")
    public ResponseEntity<Object> someMethod() {
        throw new ArithmeticException("Error");
    }

}
