package de.neuefische.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;

    private Map<String, Order> orders = new HashMap<>();

    public Order() {

    }
    public Order(String id) {
        this.id = id;
    }

    public Order(String id, Map<String, Order> orders) {
        this.id = id;
        this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }
}
