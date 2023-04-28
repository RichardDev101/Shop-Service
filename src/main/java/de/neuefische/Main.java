package de.neuefische;

import de.neuefische.model.Order;
import de.neuefische.model.Product;
import de.neuefische.repository.OrderRepo;
import de.neuefische.repository.ProductRepo;
import de.neuefische.service.ShopService;

import java.util.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //PRODUCT CREATION
        //-----------------
        Product product1 = new Product("P1", "Vacuum Cleaner");
        Product product2 = new Product("P2", "Audio Equipment");
        Product product3 = new Product("P3", "USB Stick");
        Product product4 = new Product("P4", "Record Player");
        Product product5 = new Product("P5", "Lawn mover");
        Product product6 = new Product("P6", "Couch");
        Product product7 = new Product("P7", "Wine Rack");
        Product product8 = new Product("P8", "Siemens Fridge");
        Product product9 = new Product("P9", "Bathroom cabinet");
        Product product10 = new Product("P10", "Mirror");

        //ORDER CREATION
        //----------------
        Map<String, Product> productsAll = new HashMap<>();

        productsAll.put(product1.getId(), product1);
        productsAll.put(product2.getId(), product2);
        productsAll.put(product3.getId(), product3);
        productsAll.put(product4.getId(), product4);
        productsAll.put(product5.getId(), product5);
        productsAll.put(product6.getId(), product6);
        productsAll.put(product7.getId(), product7);
        productsAll.put(product8.getId(), product8);
        productsAll.put(product9.getId(), product9);
        productsAll.put(product10.getId(), product10);


        ProductRepo productRepo = new ProductRepo();
        productRepo.setProducts(productsAll);


        //Order
        Order order1 = new Order();
        Order order2 = new Order();

        List<Product> orderProducts1 = new ArrayList<>();
        orderProducts1.add(product1);
        orderProducts1.add(product4);
        orderProducts1.add(product1);
        orderProducts1.add(product9);
        orderProducts1.add(product10);

        List<Product> orderProducts2 = new ArrayList<>();
        orderProducts2.add(product3);
        orderProducts2.add(product5);
        orderProducts2.add(product1);
        orderProducts2.add(product7);
        orderProducts2.add(product8);

        order1.setProducts(orderProducts1);
        order2.setProducts(orderProducts2);

        OrderRepo orderRepo = new OrderRepo();
        orderRepo.add(order1);
        orderRepo.add(order2);

        //Shopservice Instanciation+ Initialisation
        ShopService shopService = new ShopService();
        shopService.setProductRepo(productRepo);

        //Flag for While loop
        boolean selectionChoosed = true;
        while (serviceMenu(shopService, selectionChoosed)) {

        }



            shopService.setOrderRepo(orderRepo);
            shopService.setProductRepo(productRepo);

            shopService.getProduct("P1");
            shopService.listProducts();



    }


    public static String serviceMenu (ShopService shopService, boolean flag) {
        System.out.println("Welche Serviceleistung wollen Sie in Anspruch nehmen?");
        Scanner scanner = new Scanner(System.in);
        //Menu-Service-Request
        Map<String, String> menue = new HashMap<>();
        menue.put("a", "Einzelndes Produkt anzeigen.");
        menue.put("b", "Alle Produkte anzeigen.");
        menue.put("c", "Einzelndes Bestellung anzeigen.");
        menue.put("d", "Alle Bestellungen anzeigen");
        menue.put("e", "SERVICE BEENDEN");
        String input = scanner.next();

        switch (input) {
            case "a":
                System.out.println("Geben Sie bitte die gewünschte Produkt-ID an.");
                input = scanner.next();
                shopService.getProduct(input);
                return selectionChoosed;
            case "b":
                shopService.listProducts();
                break;
            case "c":
                System.out.println("Geben Sie bitte die gewünschte ORDER-ID an.");
                input = scanner.next();
                shopService.getOrder(input);
                break;
            case "d":
                shopService.listOrders();
                break;
            case "e":
                selectionChoosed = false;
                System.out.println("Service wurde beendet.");
                break;
            default:
                System.out.println("Es wurde keine Auswahl getroffen. Bitte trefen Sie eine Auswahl");
                break;
        }
    }

}