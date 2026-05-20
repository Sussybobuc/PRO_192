/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workshops.Workshop1;

import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class part3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            list[i] = sc.nextLine().toUpperCase();
        }
        System.out.println("\nlist of student names in uppercase:");
        for (String name : list) {
            System.out.println(name);
        }
    }

}
