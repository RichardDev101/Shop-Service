package de.neuefische.repository;

import de.neuefische.exceptions.ProductNotFoundException;
import de.neuefische.model.Product;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    @Disabled
    void testGet_positive_case_one_product() {
        // given
        Product expected = new Product("p1", "Toaster");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(expected.getId(), expected);
        productRepo.setProducts(productMap);

        // when
        Product actual = null;
        try {
            actual = productRepo.get("p1");
        } catch (ProductNotFoundException e) {
            System.out.println("Exception during test case");;
        }

        // then
        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void testGet_positive_case_several_products() {
        // given
        Product product1 = new Product("p1", "Toaster");
        Product expected = new Product("p2", "Waschmaschine");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(expected.getId(), expected);
        productRepo.setProducts(productMap);

        // when
        Product actual = null;
        try {
            actual = productRepo.get("p2");
        } catch (ProductNotFoundException e) {
            System.out.println("Exception during test case");
        }

        // then
        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void testGet_negative_case() {
        // given
        Product product1 = new Product("p1", "Toaster");
        Product product2 = new Product("p2", "Waschmaschine");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(product2.getId(), product2);
        productRepo.setProducts(productMap);

        // when
        Product actual = null;
        try {
            actual = productRepo.get("p3");
        } catch (ProductNotFoundException e) {
            System.out.println("Exception during test");
        }

        // then
        assertNull(actual);
    }
    @Test
    @Disabled
    void testList_positive_case() {
        //given
        Product product1 = new Product("p1", "Toaster");
        Product product2 = new Product("p2", "Waschmaschine");
        ProductRepo productRepo = new ProductRepo();
        Map<String, Product> expected = new HashMap<>();
        expected.put(product2.getId(), product2);
        productRepo.setProducts(expected);
        //when
        Map<String, Product> actual = productRepo.list();
        //then
        assertEquals(expected, actual);
    }
}