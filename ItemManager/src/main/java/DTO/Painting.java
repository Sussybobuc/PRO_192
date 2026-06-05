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
public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {

    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    // Getters
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean getIswatercolour() {
        return isWatercolour;
    }

    public boolean getIsframed() {
        return isFramed;
    }

    // Setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void getIswatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void getIsframed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        input();
        boolean valid = false;
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
            try {
                System.out.print("Enter width: ");
                width = sc.nextInt();
                if (width <= 0) {
                    System.out.println("Enter a valid width!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid width!");
                sc.nextLine();
                width = 0;
            }
        } while (width <= 0);

        sc.nextLine();

        do {
            try {
                System.out.print("Is this painting water coloured? (true or false) : ");
                isWatercolour = sc.nextBoolean();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid statements!");
                sc.nextLine();
            }
        } while (!valid);

        sc.nextLine();
        valid = false;
        do {
            try {
                System.out.print("Is this painting framed? (true or false) : ");
                isFramed = sc.nextBoolean();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid statements!");
                sc.nextLine();
            }
        } while (!valid);
    }

    public void outputPainting() {
        output();
        System.out.println(" >> Height: " + this.height);
        System.out.println(" >> Width: " + this.width);
        System.out.println(" >> Water colour: " + this.isWatercolour);
        System.out.println(" >> Framed: " + this.isFramed);
    }

}
