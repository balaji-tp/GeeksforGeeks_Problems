class Solution {

    int ans = 0;
    public int numSquarefulPerms(int[] nums) {
       
        
            Arrays.sort(nums);
            boolean[] used = new boolean[nums.length];
            dfs(nums, used, -1, 0);
            return ans;
        
        
    }

    private void dfs(int[] nums, boolean[] used, int prev, int count){
        if(count == nums.length){
            ans++;
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]) 
                continue;

            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) 
                continue;
            if (prev != -1 && !isSquare(prev + nums[i])) 
                continue;

            used[i] = true;
            dfs(nums, used, nums[i], count + 1);
            used[i] = false;
        }
    }

    private boolean isSquare(int x){
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }
}