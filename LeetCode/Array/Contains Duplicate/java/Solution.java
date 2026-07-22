class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set=new HashSet<>();
      for(int n:nums)
      set.add(n);
      if(nums.length!=set.size()) return true;
      return false;
    
        
    }
}