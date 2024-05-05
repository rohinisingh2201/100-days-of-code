public class Solution {
    public int maxArea(int[] ht) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = ht.length - 1;

        while(a_pointer < b_pointer) {
            if(ht[a_pointer] < ht[b_pointer]) {
                max_area = Math.max(max_area, ht[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, ht[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }
        return max_area;
    }
}
