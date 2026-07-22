class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
         for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        
        int[] re = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            re[i] = list.get(i);
        }
        return re;
    }
}