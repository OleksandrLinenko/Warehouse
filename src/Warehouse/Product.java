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
    private String name;
    private ParamList params;
    private int quantity;
    private Section section;
    private Availability availability;

    public Product(Type type, String name, ParamList params, int quantity, Section section, Availability availability) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.quantity = quantity;
        this.section = section;
        this.availability = availability;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
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

    public void setQuantity(int n) {
        quantity = quantity - n;
    }

    public void setAvailability() {
        if (quantity > 0) {
            availability = Availability.INSTOCK;
        } else {
            availability = Availability.INSTOCK;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Type: %s; ", type.getType()));
        sb.append(String.format("Name: %s", name));
        sb.append(String.format("parameters: %s; ", params.toString()));
        sb.append(String.format("quantity: %d; section: %s; availability: %s", quantity, section.getName(), availability.getName()));
        return sb.toString();
    }
}
