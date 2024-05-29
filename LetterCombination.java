//https://leetcode.com/problems/letter-combinations-of-a-phone-number/ 

package Recursion;

public class LetterCombination {
    public static void main(String[] args) {
        pad("", "12");
    }

    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2
        for(int i = (digit - 1) * 3; i<digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
}

//output - ad ae af bd be bf cd ce cf 
