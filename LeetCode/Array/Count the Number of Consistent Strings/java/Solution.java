class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] chars = new boolean[26];
        for(char c : allowed.toCharArray()){
            chars[c-'a']=true;
        }
        int count =0;
        for(String word : words){
            boolean swepper = true;
            for(char c : word.toCharArray()){
                if(!chars[c-'a']){
                    swepper = false;
                    break;
                }
            }
            if(swepper) count++;
        }
        return count;
    }
}