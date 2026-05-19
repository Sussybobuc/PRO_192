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
public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        float Mark = sc.nextFloat();
        if(Mark >= 9 && Mark <= 10){
            System.out.print("Excellent");
        } else if(Mark > 7 && Mark < 9){
            System.out.print("Good");
        }   else if(Mark > 6 && Mark < 7){
            System.out.print("Medium");
        } else if(Mark > 6 && Mark < 7){
            System.out.print("Medium");
        } else if(Mark > 5 && Mark < 6){
            System.out.print("Average");
        } else if(Mark > 0 && Mark < 5){
            System.out.print("Weak");
        } else
            System.out.print("Incorrect entry.");
    }
}
