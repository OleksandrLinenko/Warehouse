/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import UI.Ask;
import UI.Message;
import Warehouse.Application;
import Warehouse.Product;

/**
 *
 * @author oleksandrlinenko
 */
public class SendProductCommand {
    
    public static SendProductCommand create() {
        return new SendProductCommand();
    }
    
    public void handle() {
        String name = Ask.create().askString("Set product name you need send to customer: ");
        int quantity = Ask.create().askInt("Set product quantity you need send to customer: ");
        for (Product product : Application.getInstance().getProducts().getProducts()) {
            if (product.getName().equals(name) && product.getQuantity() >= quantity) {
                Message.create().show("Customer products have been succesfully sended");
                product.setQuantity(quantity);
                product.setAvailability();
            } else {
                Message.create().show("Currently where are not enough quantity of selected product or it's soldout");
            }
        }
        
    }
}
