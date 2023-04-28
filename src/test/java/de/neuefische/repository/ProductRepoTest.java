package de.neuefische.repository;

import de.neuefische.model.Product;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void testGet_positive_case_one_product() {
        // given
        Product expected = new Product("p1", "Toaster");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(expected.getId(), expected);
        productRepo.setProducts(productMap);

        // when
        Product actual = productRepo.get("p1");

        // then
        assertEquals(expected, actual);
    }

    @Test
    void testGet_positive_case_several_products() {
        // given
        Product product1 = new Product("p1", "Toaster");
        Product expected = new Product("p2", "Waschmaschine");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(expected.getId(), expected);
        productRepo.setProducts(productMap);

        // when
        Product actual = productRepo.get("p2");

        // then
        assertEquals(expected, actual);
    }

    @Test
    void testGet_negative_case() {
        // given
        Product product1 = new Product("p1", "Toaster");
        Product product2 = new Product("p2", "Waschmaschine");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(product2.getId(), product2);
        productRepo.setProducts(productMap);

        // when
        Product actual = productRepo.get("p3");

        // then
        assertNull(actual);
    }

}