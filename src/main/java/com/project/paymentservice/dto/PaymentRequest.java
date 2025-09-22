package com.project.paymentservice.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {

    private double amount;
    private UUID orderId;
    private String username;
}