/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

/**
 *
 * @author oleksandrlinenko
 */
public class Product {

    private Type type;
    private ParamList params;
    private int quantity;
    private Section section;
    private Availability availability;

    public Product(Type type, ParamList params, int quantity, Section section, Availability availability) {
        this.type = type;
        this.params = params;
        this.quantity = quantity;
        this.section = section;
        this.availability = availability;
    }

    public Type getType() {
        return type;
    }

    public ParamList getParams() {
        return params;
    }

    public int getQuantity() {
        return quantity;
    }

    public Section getSection() {
        return section;
    }

    public Availability getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Type: %s; ", type.getType()));
        sb.append(String.format("parameters: %s; ", params.toString()));
        sb.append(String.format("quantity: %d; section: %s; availability: %s", quantity, section.getName(), availability.getName()));
        return sb.toString();
    }
}
