package de.neuefische.service;

import de.neuefische.exceptions.OrderNotFoundException;
import de.neuefische.model.Order;
import de.neuefische.model.Product;
import de.neuefische.repository.OrderRepo;
import de.neuefische.repository.ProductRepo;

import java.util.Map;

public class ShopService {

    ProductRepo productRepo;

    OrderRepo orderRepo;


    public ShopService() {
        this.productRepo = new ProductRepo();
    }

    public void getProduct(String productId) {

        System.out.println(productRepo.get(productId));

    }

    public void listProducts() {

        System.out.println(productRepo.list());
    }

    public Map<String, Order> addOrder(Order newOrder) {
        Map<String, Order> result = orderRepo.add(newOrder);
        System.out.println("Order added: " + newOrder);
        return result;
    }

    public Order getOrder(String orderId) {
        Order order = null;
        try {
            order = orderRepo.get(orderId);
        } catch (OrderNotFoundException e) {
            System.out.println("No order for orderId " + orderId + " found.");;
        }
        System.out.println(order);
        return order;
    }

    public Map<String, Order> listOrders() {
        System.out.println(orderRepo.list());
        return null;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
}
