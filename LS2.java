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
public class LS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int Year = sc.nextInt();
        if((Year % 4 == 0) && (Year % 100 != 0)){
            System.out.print("Leap year");
        } else{
            System.err.println("Not leap year");
        }
    }
}
