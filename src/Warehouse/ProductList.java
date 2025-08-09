/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class ProductList {

    private List<Product> products = new ArrayList();

    public List<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProduct(Availability availbility) {
        List<Product> products = new ArrayList();
        for (Product product : products) {
            if (product.getAvailability().equals(availbility)) {
                products.add(product);
            }
        }

        return products;
    }

    public List<Product> getProduct(Section section) {
        List<Product> products = new ArrayList();
        for (Product product : products) {
            if (product.getSection().getName().equals(section.getName())) {
                products.add(product);
            }
        }

        return products;
    }

    public List<Product> getProduct(Type type) {
        List<Product> products = new ArrayList();
        for (Product product : products) {
            if (product.getType().getType().equals(type.getType())) {
                products.add(product);
            }
        }

        return products;
    }
}
