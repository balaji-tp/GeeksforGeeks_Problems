class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        // List<Integer>list=new ArrayList<>();
        // List<Integer>list1=new ArrayList<>();
        // List<List<Integer>>=new ArrayList<>();
        // for(int i:nums1) list.add(i);
        // for(int i:nums2) list1.add(i);

        // list
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        for(int i:nums1) set.add(i);
        for(int i:nums2) set1.add(i);
        for(int i:set)
        if(!set1.contains(i)) list.add(i);
        for(int i:set1)
        if(!set.contains(i)) list1.add(i);
        res.add(list);
       res.add(list1);
        return res;
       // return List.of(list,list1);
        



        
    }
}