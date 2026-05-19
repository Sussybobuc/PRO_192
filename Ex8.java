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
public class Ex8 {
    public static void main(String[] args) {
        int[] a = new int[5];
            Scanner sc = new Scanner(System.in);
            for( int i = 0; i<a.length;i++)
            {
                System.out.printf("a[%d] = ", i);
                a[i] = sc.nextInt();
            }
    double sum = 0;
    for(int x : a){
        sum += x;
        }
        System.out.println("Tong la: "+sum);
    }
}
