package de.neuefische;

import de.neuefische.model.Order;
import de.neuefische.model.Product;
import de.neuefische.repository.OrderRepo;

import java.util.HashMap;
import java.util.Map;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //PRODUCT CREATION
        //-----------------
        Product product1 = new Product("P1","Vacuum Cleaner");
        Product product2 = new Product("P2","Audio Equipment");
        Product product3 = new Product("P3","USB Stick");
        Product product4 = new Product("P4","Record Player");
        Product product5 = new Product("P5","Lawn mover");
        Product product6 = new Product("P6","Couch");
        Product product7 = new Product("P7","Wine Rack");
        Product product8 = new Product("P8","Siemens Fridge");
        Product product9 = new Product("P8","Bathroom cabinet");
        Product product10 = new Product("P8","Mirror");

        //ORDER CREATION
        //----------------
        Map<String, Product> products1 = new HashMap<>();


        products1.put("O1",product1);
        products1.put("O2",product2);
        products1.put("O3",product3);
        products1.put("O6",product4);
        products1.put("O7",product5);

        Map<String, Product> products2 = new HashMap<>();

        products2.put("10",product1);
        products2.put("O9",product1);
        products2.put("O3",product1);
        products2.put("O7",product1);
        products2.put("O6",product1);
        products2.put("O6",product1);
        products2.put("O4",product1);

        //Order
        Order order1 = new Order();
        Order order2 = new Order();

        order1.setProducts(products1);
        order2.setProducts(products2);

/*        Map<String, Order> orders = new HashMap<>();

        orders.put("O1",order1);
        orders.put("O2",order1);*/

        OrderRepo orderRepo = new OrderRepo();
        orderRepo.add(order1);
        orderRepo.add(order2);





    }
}