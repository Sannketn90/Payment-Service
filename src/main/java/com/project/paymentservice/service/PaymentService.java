package com.project.paymentservice.service;

import com.project.paymentservice.dto.PaymentRequest;
import com.project.paymentservice.dto.PaymentResponse;
import com.project.paymentservice.dto.Status;
import com.project.paymentservice.exception.PaymentProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PaymentService {

    public PaymentResponse processPayment(PaymentRequest req) {
        log.info("Fake payment processing for orderId: {} by user: {}", req.getOrderId(), req.getUsername());

        if (req.getAmount() <= 0) {
            log.warn("Invalid amount: {}", req.getAmount());
            throw new PaymentProcessingException("Amount must be greater than zero");
        }


        PaymentResponse paymentResponse = PaymentResponse.builder()
                .transactionId(UUID.randomUUID().toString())
                .status(Status.SUCCESS)
                .amount(req.getAmount())
                .build();

        log.info("Fake payment successful: {}", paymentResponse.getTransactionId());
        return paymentResponse;
    }

}