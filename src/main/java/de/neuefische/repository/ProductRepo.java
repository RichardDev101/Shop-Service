package de.neuefische.repository;

import java.util.HashMap;
import java.util.Map;

import de.neuefische.model.Product;

public class ProductRepo {

    private Map<String, Product> products = new HashMap<>();

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Product> list() {
        return null;
    }

    public Product get(String productId) {
        return products.get(productId);
    }
}
