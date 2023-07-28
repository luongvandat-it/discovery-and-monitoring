package com.luongvandat.controllers;

import com.luongvandat.models.Customer;
import com.luongvandat.services.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping("/findByPhone")
    public ResponseEntity<Customer> findByPhone(String phone) {
        return ResponseEntity.status(HttpStatus.OK).body(customerServices.findCustomerByPhone(phone));
    }
}