/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.Scanner;

/**
 *
 * @author Usui Takumi
 */
public class AreaCalculator {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        while(choice!=5){
            menu();
            System.out.print("Which shape: ");
            choice = scan.nextInt();
            System.out.println(choice(choice));
        }
    }
    public static void menu(){
        System.out.println("\n---------------\n");
        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
    }
    public static String choice(int choice){
        int b, h, l, s, w, r;
        switch(choice){
            case 1: 
                System.out.print("\nBase: ");
                b = scan.nextInt();
                System.out.print("Height: ");
                h = scan.nextInt();
                return "\nThe area is "+area_triangle(b,h); 
            case 2:
                System.out.print("\nLength: ");
                l = scan.nextInt();
                System.out.print("Height: ");
                h = scan.nextInt();
                return "\nThe area is "+area_rectangle(l,h); 
            case 3: 
                System.out.print("\nSide: ");
                s = scan.nextInt();
                return "\nThe area is "+area_square(s); 
            case 4:
                System.out.print("\nRadius: ");
                r = scan.nextInt();
                return "\nThe area is "+area_circle(r); 
            case 5:
                return "\nGoodbye";
            default: return "\nTry again";
        }
    }
    public static double area_triangle(int b, int h){ return  b*h/2; }
    public static double area_rectangle(int l, int h){ return l*h; }
    public static double area_square(int s){ return s*s; }
    public static double area_circle(int r){ return r*r*3.14; }
}
