package com.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payment.pojos.Payment;
import com.payment.response.PaymentResponse;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping(method = RequestMethod.POST, value = "/api/payment-processing/verify-payment")
	public PaymentResponse verifyPayment(@RequestBody Payment payment) {
		return paymentService.verifyPayment(payment);

	}
}
