/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Vase;
import DTO.Statue;
import DTO.Painting;
import DTO.Item;
import java.util.Scanner;

/**
 *
 * @author Sussybobuc
 */
public class AntiqueShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options={"Create a Vase","Create a Statue","Create a Painting","Display the item","Exit"};
        Item item = null;
        int choice = 0;
        do {
            choice = Menu.getChoice(options);
            switch(choice){
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item == null){
                        System.out.println("Cannot be empty!");
                    } else {
                        if ( item instanceof Vase){
                            ((Vase)item).outputVase();
                        } else if ( item instanceof Statue){
                            ((Statue)item).outputStatue();
                        } else if( item instanceof Painting){
                            ((Painting)item).outputPainting();
                        }
                    }
                    break;
            }
        } while (choice != 5);
    }
}
