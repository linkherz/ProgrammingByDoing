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
public class BabyCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            double b=0;
            System.out.print(">");
            double a = scan.nextDouble();
            String op = scan.next();
            if(!op.equalsIgnoreCase("!")) b = scan.nextDouble();
            if(a == 0) loop = false;
            else count(a,op,b);
        }
        System.out.println("Bye, Now");
    }
    public static void count(double a, String op, double b){
        if(op.equalsIgnoreCase("+")) System.out.println(a+b);
        else if(op.equalsIgnoreCase("*")) System.out.println(a*b);
        else if(op.equalsIgnoreCase("-")) System.out.println(a-b);
        else if(op.equalsIgnoreCase("/")) System.out.println(a/b);
        else if(op.equalsIgnoreCase("^")) System.out.println(Math.pow(a, b));
        else if(op.equalsIgnoreCase("%")) System.out.println(a%b);
        else if(op.equalsIgnoreCase("!")) System.out.println(FindingPrimeNumbers.fact((int)a));
        else System.out.println("Unknown operator");
    }
}
