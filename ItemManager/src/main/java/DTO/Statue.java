/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import static DTO.Item.sc;
import java.util.InputMismatchException;

/**
 *
 * @author Sussybobuc
 */
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue() {
        input();
        do {
            try {
                System.out.print("Enter weight: ");
                weight = sc.nextInt();
                if (weight <= 0) {
                    System.out.println("Enter a valid weight!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid weight!");
                sc.nextLine();
                weight = 0;
            }
        } while (weight <= 0);
        sc.nextLine();
        do {
            System.out.print("Enter colour: ");
            colour = sc.nextLine();
            if (colour.trim().isEmpty()) {
                System.out.println("Enter a valid colour!");
            }
        } while (colour.trim().isEmpty());
    }

    public void outputStatue() {
        output();
        System.out.println(" >> Height: " + this.weight);
        System.out.println(" >> Material: " + this.colour);
    }
}
