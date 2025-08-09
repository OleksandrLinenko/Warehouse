/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {
    private static Application app = new Application();
    private ProductList products = new ProductList();
    
    private Application() {
        
    }
    
    public static Application getInstance() {
        return app;
    }
    
    public ProductList getProducts() {
        return products;
    }
    
}
