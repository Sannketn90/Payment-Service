package com.project.paymentservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {

    private String transactionId;
    private Status status;
    private double amount;

}
