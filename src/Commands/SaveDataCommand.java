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
public class SaveDataCommand {

    public static SaveDataCommand create() {
        return new SaveDataCommand();
    }

    public void handle() {
        try {
            String path = Ask.create().askString("Set path to file: ");
            Data.create().saveData(path);
        } catch (IOException ex) {
            ErrorMessage.create().show("Error while saving data");
        }
    }
}
