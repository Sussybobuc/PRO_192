/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro192;

import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline
        String[] studentNames = new String[n];
        // Input student names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine().toUpperCase();
        }
        // Output student names
        System.out.println("\nlist of student names in uppercase:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }

}
