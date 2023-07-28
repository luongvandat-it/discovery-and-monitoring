package com.luongvandat.services.impl;

import com.luongvandat.models.Customer;
import com.luongvandat.repositories.CustomerRepository;
import com.luongvandat.services.CustomerServices;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerServices {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean existsCustomerByPhone(String phone) {
        return customerRepository.existsCustomerByPhone(phone);
    }
}