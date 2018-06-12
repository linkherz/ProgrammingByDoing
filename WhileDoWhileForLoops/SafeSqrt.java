/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileDoWhileForLoops;

import java.util.Scanner;

/**
 *
 * @author Usui Takumi
 */
public class SafeSqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = 0;
        do{
            System.out.print("Enter a number: ");
            numb = scan.nextInt();
            if(numb<0) System.out.println("You can't take the square root of a negative number, silly.");
        } while(numb <= 0);
        System.out.println("The square root of "+numb+" is "+Math.sqrt(numb)+".");
    }
}
