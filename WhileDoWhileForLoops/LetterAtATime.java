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
public class LetterAtATime {
    public static void main(String[] args) {
        String msg = "A man, a plan, a canal: Panama!";
        int lastindex = msg.length()-1;
        System.out.println("\nYour message is "+msg.length()+" characters long.");
        System.out.println("The first character is at position 0 and is "+msg.charAt(0));
        System.out.println("The last  character is at position "+lastindex+" and is "+msg.charAt(lastindex));
        System.out.println("\nHere are all the characters, one at a time:\n");
        for (int i = 0; i < msg.length(); i++) {
            System.out.println("\t"+i+" - '"+msg.charAt(i)+"'");
        }
        System.out.println("");
        System.out.println(getMax("hhhhellloo"));
    }
    public static char getMax(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("input word must have non-empty value.");
        }
        char maxchar = ' ';
        int maxcnt = 0;
        // if you are confident that your input will be only ascii, then this array can be size 128.
        int[] charcnt = new int[Character.MAX_VALUE + 1];
System.out.println(Character.MAX_VALUE + 1);
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
System.out.println(" "+ch);
            // increment this character's cnt and compare it to our max.
            if (++charcnt[ch] >= maxcnt) {
System.out.println(charcnt[ch]+" "+maxcnt+" "+ch);
                maxcnt = charcnt[ch];
                maxchar = ch;
            }
        }
        return maxchar;
    }
}