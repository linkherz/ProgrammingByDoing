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
public class AddValuesWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb, sum = 0;
        System.out.print("Number: ");
        numb = scan.nextInt();
        while(numb!=0){
            sum+=numb;
            System.out.println("The total so far is "+sum);
            System.out.print("Number: ");
            numb = scan.nextInt();
        }
        System.out.println("\nThe total is "+sum);
    }
}
