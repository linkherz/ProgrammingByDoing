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
public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 =0, s2 =0, s3=0;
        System.out.print("Side 1: ");
        s1 = scan.nextInt();
        do{
            System.out.print("Side 2: ");
            s2 = scan.nextInt();
            if(s2<s1) System.out.println(s2+" is smaller than "+s1+". Try again");
        } while(s2 < s1);
        do{
            System.out.print("Side 3: ");
            s3 = scan.nextInt();
            if(s3<s2) System.out.println(s3+" is smaller than "+s2+". Try again");
        } while(s3 < s2);
        System.out.println("\nYour three sides are "+s1+" "+s2+" "+s3);
        if(Math.pow(s3,2) != Math.pow(s2, 2) + Math.pow(s1, 2)) System.out.println("NO!  These sides do not make a right triangle!");
        else System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
    }
}
