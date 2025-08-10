/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
                if (split.length == 5) {
                    Type type = new Type(split[0]);
                    String name = split[1];
                    ParamList params = new ParamList();
                    String[] secondSplit = split[2].split(":");
                    for (int i = 0; i < secondSplit.length; i++) {
                        String[] splitParam = secondSplit[i].split(":");
                        params.addParam(new Parameter(splitParam[0], splitParam[1]));
                    }
                    int quantity = Integer.parseInt(split[3].trim());
                    Section section = new Section(split[4]);
                    Availability availability = null;
                    if (split[5].equals("Instock")) {
                        availability = Availability.INSTOCK;
                    } else {
                        availability = Availability.SOLDOUT;
                    }
                    Product product = new Product(type, name, params, quantity, section, availability);
                    Application.getInstance().getProducts().addProduct(product);
                }
            }
        } catch (IOException ex) {
            throw new IOException("Errow while reading file data");
        }
    }

    public void saveData(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)))) {
            for (Product product : Application.getInstance().getProducts().getProducts()) {
                bw.write(String.format("%s;", product.getType().getType()));
                bw.write(String.format("%s;", product.getName()));
                for (Parameter parameter : product.getParams().getParams()) {
                    bw.write(String.format("%s:%d;", parameter.getName(), parameter.getValue()));
                }

                bw.write(String.format("%d;", product.getQuantity()));
                bw.write(String.format("%s", product.getAvailability().getName()));
            }
        } catch (IOException ex) {
            throw new IOException("Error while savind data");
        }
    }

}
