/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileDoWhileForLoops;

import java.util.Random;

/**
 *
 * @author Usui Takumi
 */
public class DiceDoubles {
    public static void main(String[] args) {
        Random rnd = new Random();
        int d1, d2, total;
        do{
            d1 = 1+rnd.nextInt(6);
            d2 = 1+rnd.nextInt(6);
            total = d1+d2;
            System.out.println("Roll #1 : "+d1);
            System.out.println("Roll #2 : "+d2);
            
            System.out.println("The total is "+total+"!\n");
        }
        while(d1!=d2);
    }
}