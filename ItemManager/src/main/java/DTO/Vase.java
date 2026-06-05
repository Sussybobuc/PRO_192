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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        input();
                do {
            try {
                System.out.print("Enter height: ");
                height = sc.nextInt();
                if (height <= 0) {
                    System.out.println("Enter a valid height!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid height!");
                sc.nextLine();
                height = 0;
            }
        } while (height <= 0);
        sc.nextLine();
        do {
            System.out.print("Enter material: ");
            material = sc.nextLine();
            if (material.trim().isEmpty()) {
                System.out.println("Enter a valid material!");
            }
        } while (material.trim().isEmpty());
    }

    public void outputVase() {
        output();
        System.out.println(" >> Height: " + this.height);
        System.out.println(" >> Material: " + this.material);
    }
}
