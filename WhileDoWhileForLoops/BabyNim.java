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
public class BabyNim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pile;
        int a,b,c,rmv;
        a = 3;
        b = 3;
        c = 3;
        do{
            System.out.println("\nA: "+a+"  B: "+b+"  C: "+c);
            System.out.print("\nChoose a pile :");
            pile = scan.next();
            System.out.print("How many to remove from pile "+pile.toUpperCase()+": ");
            rmv = scan.nextInt();
            if(pile.equalsIgnoreCase("a")) a-=rmv;
            else if(pile.equalsIgnoreCase("b")) b-=rmv;
            else if(pile.equalsIgnoreCase("c")) c-=rmv;
        }while(a>0 || b>0 || c>0);
        System.out.println("\nA: "+a+"  B: "+b+"  C: "+c);
        System.out.println("\nAll piles are empty. Good job!");
    }
}
