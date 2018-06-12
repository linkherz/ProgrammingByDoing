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
public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from, to, by;
        System.out.print("Count from: ");
        from = scan.nextInt();
        System.out.print("Count to  : ");
        to = scan.nextInt();
        System.out.print("Count by  : ");
        by = scan.nextInt();
        System.out.println("");
        for (int i = from; i <= to; i+=by) {
            System.out.print(i+" ");
        }
    }
}