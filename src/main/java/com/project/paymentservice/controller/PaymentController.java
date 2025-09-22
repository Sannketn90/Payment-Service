package com.project.paymentservice.controller;

import com.project.paymentservice.dto.PaymentRequest;
import com.project.paymentservice.dto.PaymentResponse;
import com.project.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/charge")
    public ResponseEntity<PaymentResponse> charge(@RequestBody PaymentRequest req) {
        PaymentResponse paymentResponse = paymentService.processPayment(req);
        return ResponseEntity.ok(paymentResponse);
    }

}
