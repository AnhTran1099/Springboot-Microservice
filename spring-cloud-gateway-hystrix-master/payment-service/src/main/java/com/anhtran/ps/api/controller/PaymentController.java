package com.anhtran.ps.api.controller;

import com.anhtran.ps.api.entity.Payment;
import com.anhtran.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        return service.doPayment(payment);
    }

}
