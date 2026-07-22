import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i : nums1) {
            for (int n : nums2) {
                if (n == i) {
                    set.add(i);   
                }
            }
        }

        int[] ans = new int[set.size()];
        int ind = 0;

        for (int x : set) {
            ans[ind++] = x;
        }

        return ans;   
    }
}
