import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int index = 0;
        for (int val : set) {
            if (val == index) {
                index++;
            } else {
                return index;
            }
        }

        return n;
    }
}
