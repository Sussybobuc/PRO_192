/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro192;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class Ex10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextFloat();
        }
        Arrays.sort(a);
        System.out.println("Max value " + a[n - 1]);
    }
}
