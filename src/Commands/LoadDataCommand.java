/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import UI.Ask;
import UI.ErrorMessage;
import Warehouse.Data;
import java.io.IOException;

/**
 *
 * @author oleksandrlinenko
 */
public class LoadDataCommand {
    
    public static LoadDataCommand create() {
        return new LoadDataCommand();
    }
    
    public void handle() {
        try {
            String path = Ask.create().askString("Set path to file: ");
            Data.create().loadData(path);
        } catch (IOException ex) {
            ErrorMessage.create().show("Error while loading data");
        }
    }
}
