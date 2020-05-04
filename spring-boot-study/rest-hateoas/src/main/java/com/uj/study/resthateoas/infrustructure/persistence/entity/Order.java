package com.uj.study.resthateoas.infrustructure.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author ：unclejet
 * @date ：Created in 2020/3/2 6:44
 * @description：
 * @modified By：
 * @version:
 */
@Getter
@Setter
public class Order extends RepresentationModel<Order> {
    private String orderId;
    private double price;
    private int quantity;

    public Order() {
        super();
    }

    public Order(final String orderId, final double price, final int quantity) {
        super();
        this.orderId = orderId;
        this.price = price;
        this.quantity = quantity;
    }
}
