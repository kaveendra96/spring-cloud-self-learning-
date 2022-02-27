package com.kaveendra.demo001.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class CustomerDTO {
    private UUID customerId;
    private String name;
}
