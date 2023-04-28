package de.neuefische.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    static int counter;
    private String id;

    private List<Product> products = new ArrayList<>();

    private OrderStatus orderstatus;

    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OrderStatus getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        this.orderstatus = orderstatus;
    }


    public Order() {
        counter++;
        id = String.valueOf(counter);

    }
    public Order(String id) {
        this.id = id;
        counter++;
    }

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                ", orderstatus=" + orderstatus +
                ", dateTime=" + dateTime +
                '}';
    }
}
