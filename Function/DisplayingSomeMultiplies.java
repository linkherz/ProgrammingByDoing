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
public class DisplayingSomeMultiplies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int numb = scan.nextInt();
        System.out.println("");
        for (int i = 1; i < 13; i++) {
            System.out.println(numb+"x"+i+" = "+i*numb);
        }
    }
}