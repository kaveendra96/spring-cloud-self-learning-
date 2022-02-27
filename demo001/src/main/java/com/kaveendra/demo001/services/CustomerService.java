package com.kaveendra.demo001.services;

import com.kaveendra.demo001.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerByUUID(UUID customerId);
}
