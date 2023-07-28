package com.luongvandat.services;

import com.luongvandat.models.Customer;

public interface CustomerServices {
    Customer findCustomerByPhone(String phone);
}