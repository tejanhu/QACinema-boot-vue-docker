package com.qa.application.cinemaapp.controller;

import com.qa.application.cinemaapp.domain.Payment;
import com.qa.application.cinemaapp.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentDataController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("makePayment")
    public com.paypal.api.payments.Payment makePayment(){
        Payment payment = new Payment();
       return payment.createPayment();
    }

}
