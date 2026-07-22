class Solution {
    public int countSegments(String s) {
        int count =0;
        if(s.length()==0){
            return 0;
        }
        String[] words = s.split(" ");
        for(String word:words){
            if(!word.isEmpty()){
                count++;
            }
            

        }
        return count;
        
        
    }
}