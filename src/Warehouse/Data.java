/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oleksandrlinenko
 */
public class Data {

    public static Data create() {
        return new Data();
    }

    public void loadData(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                if (split.length == 4) {
                    Type type = new Type(split[0]);
                    ParamList params = new ParamList();
                    String[] secondSplit = split[1].split(":");
                    for (int i = 0; i < secondSplit.length; i++) {
                        String[] splitParam = secondSplit[i].split(":");
                        params.addParam(new Parameter(splitParam[0], splitParam[1]));
                    }
                    int quantity = Integer.parseInt(split[2].trim());
                    Section section = new Section(split[3]);
                    Availability availability = null;
                    if (split[4].equals("Instock")) {
                        availability = Availability.INSTOCK;
                    } else {
                        availability = Availability.SOLDOUT;
                    }
                    Product product = new Product(type, params, quantity, section, availability);
                    Application.getInstance().getProducts().addProduct(product);
                }
            }
        } catch (IOException ex) {
            throw new IOException("Errow while reading file data");
        }
    }

}
