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
public class KeyChain {
    private static Scanner scan = new Scanner(System.in);
    private static int currNumKC = 0;
    private static int priceKC = 10;
    private static double tax = 8.25;
    private static int shipCost = 5;
    private static int addShipCost = 1;
    public static void main(String[] args) {
        boolean loop = true;
        int choice;
        while(loop){
            choice = menu();
            choiceFunction(choice);
            if(choice == 4) loop = false;
        }
    }
    public static int menu(){
        System.out.println("");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.print("\nPlease enter your choice: ");
        int choiceMenu = scan.nextInt();
        return choiceMenu;
    }
    public static void choiceFunction(int c){
        System.out.println("");
        switch(c){
            case 1: c1(); break;
            case 2: c2(); break;
            case 3: c3(); break;
            case 4: c4(); break;
            default: System.out.println("Please choose 1 - 4"); break;
        }
    }
    public static void c1(){
//        System.out.println("ADD KEYCHAINS");
        System.out.print("You have "+currNumKC+" keychains. How many to add? ");
        int add = scan.nextInt();
        currNumKC += add;
        System.out.println("You now have "+currNumKC+" keychains.");
    }
    public static void c2(){
//        System.out.println("REMOVE KEYCHAINS");
        System.out.print("You have "+currNumKC+" keychains. How many to remove? ");
        int rmv = scan.nextInt();
        if(check(rmv)) {
            currNumKC -= rmv;
            System.out.println("You now have "+currNumKC+" keychains.");
        } else {
            System.out.println("The number to remove must be smaller or same with number of yours");
            c2();
        }
    }
    public static void c3(){
//        System.out.println("VIEW ORDER");
        System.out.println("You have "+currNumKC+" keychains.");
        System.out.println("Keychains cost $"+priceKC+" each.");
        System.out.println("Tax is "+tax+"%");
        System.out.println("Shipping cost is $"+shipCost+" plus $"+addShipCost+" for each additional key chain");
        double total = currNumKC*priceKC+shipCost+addShipCost*currNumKC;
        System.out.println("Total cost is $"+total+".");
        total += total * tax / 100;
        System.out.println("Total after cost is $"+total+".");
    }
    public static void c4(){
        System.out.println("CHECKOUT");
        System.out.print("\nWhat is your name? ");
        String name = scan.next();
        c3();
        System.out.println("Thanks for your order, "+name);
    }
    public static boolean check(int rmv){
        if(rmv > currNumKC) return false;
        else return true;
    }
}