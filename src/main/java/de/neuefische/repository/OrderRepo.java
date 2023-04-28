package de.neuefische.repository;

import de.neuefische.model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders = new HashMap<>();

    public OrderRepo(Map<String, Order> orders) {
        this.orders = orders;
    }

    public OrderRepo() {
    }

    public Map<String, Order> list() {
        return null;
    }

    public Order get(String orderId) {
        return null;
    }

    public Map<String, Order> add(Order newOrder) {
        return null;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }
}
