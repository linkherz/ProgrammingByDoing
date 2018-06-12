/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usui Takumi
 */
public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Which one is the ace?");
        System.out.println("##\t##\t##");
        System.out.println("##\t##\t##");
        System.out.println(" 1\t 2\t 3");
        System.out.print("\n> ");
        int num = scan.nextInt();
        
        int rndNum = 1+rnd.nextInt(3);
        if(num == rndNum) System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        else System.out.println("Ha! Fast Eddie wins again! The ace was card number "+rndNum);
        if(rndNum == 1) { 
            System.out.println("AA\t##\t##");
            System.out.println("AA\t##\t##");
            System.out.println(" 1\t 2\t 3");
        } else if(rndNum == 2){
            System.out.println("##\tAA\t##");
            System.out.println("##\tAA\t##");
            System.out.println(" 1\t 2\t 3");
        } else {
            System.out.println("##\t##\tAA");
            System.out.println("##\t##\tAA");
            System.out.println(" 1\t 2\t 3");
        }
    }
}
