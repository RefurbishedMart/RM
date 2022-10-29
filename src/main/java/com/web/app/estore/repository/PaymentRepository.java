package com.web.app.estore.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, String> {

}

