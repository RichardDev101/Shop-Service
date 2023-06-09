package de.neuefische.repository;

import java.util.HashMap;
import java.util.Map;

import de.neuefische.exceptions.OrderNotFoundException;
import de.neuefische.exceptions.ProductNotFoundException;
import de.neuefische.model.Product;

public class ProductRepo {

    private Map<String, Product> products = new HashMap<>();

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Product> list() {
        return products;
    }

    public Product get(String productId) throws ProductNotFoundException {

        if (products.containsKey(productId))
            return products.get(productId);

        throw new ProductNotFoundException("No product with id" + productId + " found.");
    }
}
