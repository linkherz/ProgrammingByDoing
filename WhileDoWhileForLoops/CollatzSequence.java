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
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, increment=0, max;
        System.out.print("Starting number: ");
        n = scan.nextInt();
        max = n;
        do{
            System.out.print(n+"  ");
            if(n%2==0) n = n/2;
            else n = n*3+1;
            if(n > max) max = n;
            increment++;
        }while(n!=1);
        System.out.println(n);
        System.out.println("\nTerminated after "+increment+" steps.");
        System.out.println("The largest value was "+max+".");
    }
}
