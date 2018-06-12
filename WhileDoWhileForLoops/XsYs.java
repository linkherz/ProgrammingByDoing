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
public class XsYs {
    public static void main(String[] args) {
        double x = -10;
        System.out.println("X\tY");
        for (x = -10; x <= 10; x+=0.5) {
            System.out.print(x+"\t"+Math.pow(x, 2));
            System.out.println("");
        }
    }
}
