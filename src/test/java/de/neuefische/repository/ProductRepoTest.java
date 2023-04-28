package de.neuefische.repository;

import de.neuefische.model.Product;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void testGet() {
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

}