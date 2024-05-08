class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            if(even(num)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean even(int n) {
        int numOfDigits = digits(n);
        return numOfDigits % 2 == 0;
    }

    public int digits(int n) {
        if(n < 0) {
            n = n * -1;
        }

        if(n == 0) {
            return 1;
        }

        int c = 0;

        while (n > 0) {
            c++;
            n = n / 10; // 12/10 = 1
        }

        return c;
    }
}
