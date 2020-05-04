package com.uj.study.resthateoas.application.service;

import com.uj.study.resthateoas.infrustructure.persistence.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}
