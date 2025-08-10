/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Warehouse;

/**
 *
 * @author oleksandrlinenko
 */
public enum Availability {
    INSTOCK("Instock"), SOLDOUT("Soldout");

    private String availability;

    Availability(String availability) {
        this.availability = availability;
    }

    public String getName() {
        return availability;
    }
}
