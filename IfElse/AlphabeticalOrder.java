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
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your last name? ");
        String ln = scan.next();
        
        if(ln.compareTo("Carswell") < 0) System.out.println("you don't have to wait long");
        if(ln.compareTo("Jones") < 0) System.out.println("that's not bad");
        if(ln.compareTo("Smith") < 0) System.out.println("looks like a bit of a wait");
        if(ln.compareTo("Young") < 0) System.out.println("it's gonna be a while");
        else System.out.println("not going anywhere for a while?");
    }
}
