package com.sahan.rentcloud.profileservice.service;

import com.sahan.rentcommons.commons.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
