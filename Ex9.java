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
public class Ex9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int x : a) {
            if (min > x) {
                min = x;
            }
        }
        System.out.println("So nho nhat la: " + min);
    }
}
