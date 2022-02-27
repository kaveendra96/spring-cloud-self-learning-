package com.kaveendra.demo001.services;

import com.kaveendra.demo001.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerByUUID(UUID customerId) {
        return CustomerDTO.builder()
                .customerId(customerId)
                .name("Nipun Kaveendra").build();
    }
}
