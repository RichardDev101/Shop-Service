package de.neuefische.service;

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

    public Product getProduct(String productId) {

        System.out.println(productRepo.get(productId));
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

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
}
