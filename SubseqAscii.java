package Recursion;

public class Subset {

    public static void main(String[] args) {
        subseqAscii("", "abc");
    }

    static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }
}
//abc ab ab99 ac a a99 a98c a98 a9899 bc b b99 c  99 98c 98 9899 97bc 97b 97b99 97c 97 9799 9798c 9798 979899 - output
