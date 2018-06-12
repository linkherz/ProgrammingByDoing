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
public class HiLoLimitedTries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int rndInt = 1+rnd.nextInt(100);
        int guess = -1;
        int trial = 0;
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
//        System.out.println(rndInt);
        while(rndInt!=guess && trial<7){
            trial++;
            System.out.print("Guess # "+trial+":");
            guess = scan.nextInt();
            if(trial>7) System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
            else {
                if(guess < rndInt) System.out.println("Sorry, you are too low.");
                else if(guess > rndInt) System.out.println("Sorry, that guess is too high.");
                else System.out.println("You guessed it!  What are the odds?!?");
            }
        }
    }
}
