class Solution {

    public int solve(int n, int k) {
        if(n == 1) {
            return 0; //put 1 as index 0
        }
        return (solve(n-1, k) + k) % n;
    }

    public int findTheWinner(int n, int k) {
        int ans = solve(n, k) + 1; //mod will include 0 as well so add 1 for 1 based ind
        return ans;
    }
}
