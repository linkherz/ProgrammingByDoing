/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfElse;

import java.util.Scanner;

/**
 *
 * @author Usui Takumi
 */
public class TwoMoreQuestion
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println("\nThink of something and I'll try to guess it!");
        System.out.print("\nQuestion 1) Does it stay inside or outside or both? ");
        String q1 = scan.next();
        System.out.print("Question 2) Is it a living thing? ");
        String q2 = scan.next();
        
        String ans = "";
        if(q1.equalsIgnoreCase("inside") && q2.equalsIgnoreCase("yes")) ans = "houseplant";
        if(q1.equalsIgnoreCase("outside") && q2.equalsIgnoreCase("yes")) ans = "bison";
        if(q1.equalsIgnoreCase("both") && q2.equalsIgnoreCase("yes")) ans = "dog";
        if(q1.equalsIgnoreCase("inside") && q2.equalsIgnoreCase("no")) ans = "shower curtain";
        if(q1.equalsIgnoreCase("outside") && q2.equalsIgnoreCase("no")) ans = "billboard";
        if(q1.equalsIgnoreCase("both") && q2.equalsIgnoreCase("no")) ans = "cell phone";
        
        System.out.println("Then what else could you be thinking of besides a "+ans);
    }
}