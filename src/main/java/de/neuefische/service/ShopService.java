package de.neuefische.service;

import de.neuefische.model.Order;
import de.neuefische.model.Product;
import de.neuefische.repository.OrderRepo;
import de.neuefische.repository.ProductRepo;

import java.util.Map;

public class ShopService {

    ProductRepo productRepo;

    OrderRepo orderRepo;

    public Product getProduct(String productId) {
        return null;
    }

    public Map<String, Product> listProducts() {
        return null;
    }

    public Map<String, Order> addOrder(Order newOrder) {
        return null;
    }

    public Order getOrder(String orderId) {
        return null;
    }

    public Map<String, Order> listOrders() {
        return null;
    }

}
