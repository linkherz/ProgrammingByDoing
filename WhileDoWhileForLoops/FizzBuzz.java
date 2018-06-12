/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileDoWhileForLoops;

/**
 *
 * @author Usui Takumi
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%3==0) System.out.print("Fizz");
            if(i%5==0) System.out.print("Buzz");
            if(i%3!=0 && i%5!=0) System.out.print(i);
            System.out.println("");
        }
    }
}
