package com.luongvandat.services;

import com.luongvandat.models.Customer;

public interface CustomerServices {
    Customer addCustomer(Customer customer);

    boolean existsCustomerByPhone(String phone);
}