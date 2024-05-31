package Recursion;

public class NumOfDiceRolls {

    public static void main(String[] args) {
        dice("", 4);
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.print(p + " ");
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
}
//1111 112 121 13 211 22 31 4 - output
