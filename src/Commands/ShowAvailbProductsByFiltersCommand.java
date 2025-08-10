/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import UI.Ask;
import UI.ShowProductList;
import Warehouse.Application;
import Warehouse.Availability;
import Warehouse.ProductList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowAvailbProductsByFiltersCommand {

    public static ShowAvailbProductsByFiltersCommand create() {
        return new ShowAvailbProductsByFiltersCommand();
    }

    public void handle() {
        String name = Ask.create().askString("Set item name: ");
        int option = Ask.create().askInt("Set availability - 1 for instock items or 2 for soldout items: ");
        Availability availability = null;
        if (option == 1) {
            availability = Availability.INSTOCK;
        } else {
            availability = Availability.SOLDOUT;
        }

        ProductList products = Application.getInstance().getProducts().getProduct(availability, name);
        ShowProductList.create().showProductList(products);
    }
}
