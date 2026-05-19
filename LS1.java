/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro192;

import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class LS1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so A: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.print("A is even");
        } else{
            System.err.println("A is odd");
        }
    }
}
