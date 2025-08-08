/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    private static Scanner sc = new Scanner(System.in);

    public static MainMenu create() {
        return new MainMenu();
    }

    public void show() {
        boolean endProgram = false;
        do {
            menu();
            int option = getOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    public static void menu() {
        Message.create().show("\nWarehouse\n");
        Message.create().show("1. Load products data from a file\n");
        Message.create().show("2. Show available products by parameters and availability\n");
        Message.create().show("3. Send product to the customer if they are available and match the customer's order requirements\n");
        Message.create().show("4. Save product data to a file after sending all orders\n");
        Message.create().show("0. End of program\n");
    }

    public static int getOption() {
        Message.create().show("Pick the option: ");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return - 1;
        }

        return option;
    }

    public static boolean doOption(int option) {
        switch (option) {
            case 0:
                return true;
            case 1:

                break;
            default:
                Message.create().show("Undefined option");
        }

        return false;
    }

}
