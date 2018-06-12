/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileDoWhileForLoops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usui Takumi
 */
public class NumberGuessingWithCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int rndInt = 1+rnd.nextInt(10);
        int guess = -1;
        int trial = 0;
//        System.out.println(rndInt);
        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
        do{
            System.out.print("Your guess: ");
            guess = scan.nextInt();
            trial++;
            if(rndInt!=guess) System.out.println("That is incorrect.  Guess again.");
        }while(rndInt!=guess);
//        while(rndInt!=guess){
//            System.out.print("Your guess: ");
//            guess = scan.nextInt();
//            trial++;
//            if(rndInt!=guess) System.out.println("That is incorrect.  Guess again.");
//        }
        System.out.println("That's right!  You're a good guesser.");
        System.out.println("It only took you "+trial+" tries.");
    }
}
