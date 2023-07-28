package com.luongvandat.controllers;

import com.luongvandat.models.Customer;
import com.luongvandat.services.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addCustomer(String name, String phone, String city) {
        if (customerServices.existsCustomerByPhone(phone)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Phone number already exists");
        }
        Customer customer = new Customer(name, phone, city);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerServices.addCustomer(customer));
    }
}