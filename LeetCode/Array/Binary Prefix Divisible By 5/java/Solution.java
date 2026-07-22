import java.util.*;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int prefixMod = 0;

        for (int num : nums) {
            prefixMod = (prefixMod * 2 + num) % 5;
            result.add(prefixMod == 0);
        }

        return result;
    }
}
