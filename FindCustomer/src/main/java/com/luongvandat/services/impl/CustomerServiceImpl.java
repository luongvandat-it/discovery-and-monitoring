package com.luongvandat.services.impl;

import com.luongvandat.models.Customer;
import com.luongvandat.repositories.CustomerRepository;
import com.luongvandat.services.CustomerServices;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerServices {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerByPhone(String phone) {
        return customerRepository.findCustomerByPhone(phone);
    }
}