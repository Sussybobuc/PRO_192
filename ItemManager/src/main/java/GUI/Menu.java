/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class Menu {

    private static Scanner sc = new Scanner(System.in);

    public static int getChoice(String[] options) {
        int choice = 0;
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }
        System.out.println("Choose 1.." + options.length + ": ");
        do {
            try {
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        } while (choice < 1 || choice > options.length);
        return choice;

    }
}
