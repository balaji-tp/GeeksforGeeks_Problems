class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int num : nums){
            if(map.get(num) ==1){
                if(!map.containsKey(num-1) && !map.containsKey(num+1))list.add(num);
            }
        }
        return list;
        
        
    }
}