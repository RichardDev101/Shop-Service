package de.neuefische.repository;

import de.neuefische.exceptions.OrderNotFoundException;
import de.neuefische.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderRepo {

    private Map<String, Order> orders = new HashMap<>();

    public OrderRepo(Map<String, Order> orders) {
        this.orders = orders;
    }

    public OrderRepo() {
    }

    public Map<String, Order> list() {
        return orders;
    }

    public Order get(String orderId) throws OrderNotFoundException {
        if (orders.containsKey(orderId))
            return orders.get(orderId);

        throw new OrderNotFoundException("No order with id" + orderId + " found.");
    }

    public Map<String, Order> add(Order newOrder) {
        orders.put(newOrder.getId(), newOrder);
        return orders;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }
    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
