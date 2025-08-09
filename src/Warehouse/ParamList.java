/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class ParamList {

    private List<Parameter> params = new ArrayList();

    public List<Parameter> getParams() {
        return params;
    }

    public void addParam(Parameter parameter) {
        params.add(parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Parameter parameter : params) {
            sb.append(String.format("%s, ", parameter.toString()));
        }

        return sb.toString();
    }
}
