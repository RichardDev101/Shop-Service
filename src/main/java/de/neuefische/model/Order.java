package de.neuefische.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;

    private Map<String, Product> products = new HashMap<>();

    public Order() {

    }
    public Order(String id) {
        this.id = id;
    }

    public Order(String id, Map<String, Product> orders) {
        this.id = id;
        this.products = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }
}
