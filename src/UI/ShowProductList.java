/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Warehouse.Product;
import Warehouse.ProductList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowProductList {
    
    public static ShowProductList create() {
        return new ShowProductList();
    }
    
    public void showProductList(ProductList products) {
        Message.create().show("Products:\n");
        for (Product product : products.getProducts()) {
            Message.create().show(String.format("%s\n", product.toString()));            
        }
    }
}
