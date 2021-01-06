package com.payment;

import org.springframework.stereotype.Service;

import com.payment.pojos.Payment;
import com.payment.response.PaymentResponse;

@Service
public class PaymentService {

	public PaymentResponse verifyPayment(Payment payment) {

		Boolean status = false;

		if (payment.getPaymentMethod().equalsIgnoreCase("credit-card")) {
			status = true;
		}

		else if (payment.getPaymentMethod().equalsIgnoreCase("debit-card")) {
			status = true;
		}

		else if (payment.getPaymentMethod().equalsIgnoreCase("cash")) {
			status = true;
		}

		return new PaymentResponse(status);

	}
}
