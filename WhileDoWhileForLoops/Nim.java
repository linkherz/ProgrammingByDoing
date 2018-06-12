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
public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pile, p1, p2, play;
        int a,b,c,rmv,tot,check=0;
        a = 3;
        b = 4;
        c = 5;
        tot = a+b+c;
        System.out.print("Player 1, enter your name: ");
        p1 = scan.next();
        System.out.print("Player 2, enter your name: ");
        p2 = scan.next();
        play = p1;
        do{
//            System.out.println("\nA: "+a+"  B: "+b+"  C: "+c);
//            System.out.println("A : "+starRow(a));
//            System.out.println("B : "+starRow(b));
//            System.out.println("C : "+starRow(c));
//            System.out.println("A : \n"+starColumn(a,Math.max(a, Math.max(b, c))));
//            System.out.println("B : \n"+starColumn(b,Math.max(a, Math.max(b, c))));
//            System.out.println("C : \n"+starColumn(c,Math.max(a, Math.max(b, c))));
            printStarColumn(a, b, c);
            System.out.print("\n"+play+", Choose a pile :");
            pile = scan.next();
            if(pile.equalsIgnoreCase("a")) check = a;
            else if(pile.equalsIgnoreCase("b")) check = b;
            else if(pile.equalsIgnoreCase("c")) check = c;
            while(check <= 0){
                System.out.print("\nNice try, "+play+". That pile is empty. Choose again: ");
                pile = scan.next();
                if(pile.equalsIgnoreCase("a")) check = a;
                else if(pile.equalsIgnoreCase("b")) check = b;
                else if(pile.equalsIgnoreCase("c")) check = c;
            }
            System.out.print("How many to remove from pile "+pile.toUpperCase()+": ");
            rmv = scan.nextInt();
            while(rmv <= 0){
                System.out.print("\nYou must choose at least 1. How many? ");
                rmv = scan.nextInt();
            }
            while(rmv > check){
                System.out.print("\nPile "+pile.toUpperCase()+" doesn't have that many. Try again: ");
                rmv = scan.nextInt();
            }
            if(pile.equalsIgnoreCase("a")) a-=rmv;
            else if(pile.equalsIgnoreCase("b")) b-=rmv;
            else if(pile.equalsIgnoreCase("c")) c-=rmv;
            if(play.equalsIgnoreCase(p1)) play = p2;
            else if(play.equalsIgnoreCase(p2)) play = p1;
            tot = a+b+c;
            if(tot<=1) break;
        }while(a>0 || b>0 || c>0);
        System.out.println("\nA: "+a+"  B: "+b+"  C: "+c);
//        System.out.println("\n"+play+", All piles are empty. Good job! You Win");
        System.out.print(play+", you must take the last remaining counter, so you lose. ");
        if(play.equalsIgnoreCase(p1)) System.out.print(p2+" wins!");
        else if(play.equalsIgnoreCase(p2)) System.out.print(p1+" wins!");        
    }
    public static String starRow(int x){
        if(x<=1) return "*";
        else return "*"+starRow(x-1);
    }
    public static String starColumn(int x, int max){
        if(x<max) return "\n"+starColumn(x,max-1);
        if(x<=1) return "*";
        else return "*"+starColumn(x-1,max);
    }
    public static void printStarColumn(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        for (int i = max; i > 0; i--) {
            if(a<i) System.out.print("  ");
            else System.out.print("* ");
            if(b<i) System.out.print("  ");
            else System.out.print("* ");
            if(c<i) System.out.print("  ");
            else System.out.print("* ");
            System.out.println("");
        }
        System.out.println("A B C");
    }
}