/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author Usui Takumi
 */
public class FindingPrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)) System.out.println(i+" <");
//            else System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        //https://en.wikipedia.org/wiki/Primality_test
        if(n<=1) return false;
        else if(n<=3) return true;
        else if(n%2==0 || n%3==0) return false;
        int i = 5;
        while(i*i<=n){
            if(n%i == 0 || n%(i+2)==0) return false;
            i += 6;
        }
        return true;
    }
    public static int fact(int n){
        if(n <= 1) return 1;
        return n*fact(n-1);
    }
}
