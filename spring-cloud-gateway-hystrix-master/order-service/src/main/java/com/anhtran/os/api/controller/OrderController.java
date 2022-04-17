package com.anhtran.os.api.controller;

import com.anhtran.os.api.common.Payment;
import com.anhtran.os.api.common.TransactionRequest;
import com.anhtran.os.api.common.TransactionResponse;
import com.anhtran.os.api.entity.Order;
import com.anhtran.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {

        return service.saveOrder(request);
    }
}
