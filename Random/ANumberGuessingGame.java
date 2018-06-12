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
public class ANumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your Guess : ");
        int guess = scan.nextInt();
        int randInt = 1 + rnd.nextInt(10);
        if(guess == randInt) System.out.println("That's right!  My secret number was "+randInt+"!");
        else System.out.println("Sorry, but I was really thinking of "+randInt+".");
    }
}
