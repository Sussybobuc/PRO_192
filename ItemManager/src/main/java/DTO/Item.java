/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DTO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    // Getters
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    // Setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    protected static Scanner sc = new Scanner(System.in);
    public void input() {
        do {
            try {
                System.out.print("Enter value: ");
                value = sc.nextInt();
                if (value <= 0) {
                    System.out.println("Enter a valid value!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid value!");
                sc.nextLine();
                value = 0;
            }
        } while (value <= 0);
        sc.nextLine();
        do {
            System.out.print("Enter creator: ");
            creator = sc.nextLine();
            if (creator.trim().isEmpty()) {
                System.out.println("Enter a valid creator!");
            }
        } while (creator.trim().isEmpty());
    }

    public void output() {
        System.out.println(" >> Value: " + this.value);
        System.out.println(" >> Creator: " + this.creator);

    }
}
