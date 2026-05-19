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
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Hours: ");
        int Hours = sc.nextInt();
        System.out.print("Hourly wages: ");
        double Wages = sc.nextInt();
        double Pay;
        if( Hours > 40){
            Pay = ((Hours-40)*Wages)*1.5 + Hours*Wages;
    } else{
            Pay = Hours*Wages;
        }
        System.out.print("Payment: "+Pay);
    }
}
