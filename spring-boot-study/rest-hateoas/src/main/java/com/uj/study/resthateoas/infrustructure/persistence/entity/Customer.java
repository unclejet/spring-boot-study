package com.uj.study.resthateoas.infrustructure.persistence.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

/**
 * @author ：unclejet
 * @date ：Created in 2020/3/2 6:38
 * @description：
 * @modified By：
 * @version:
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class Customer extends RepresentationModel<Customer> {
    private String customerId;
    private String customerName;
    private String companyName;
    private Map<String, Order> orders;

    public Customer() {
        super();
    }

    public Customer(final String customerId, final String customerName, final String companyName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.companyName = companyName;
    }
}
