import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
