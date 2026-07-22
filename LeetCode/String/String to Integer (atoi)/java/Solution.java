class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length()&&s.charAt(i)==' ')i++;
        int sign=1;
        if(i<s.length()&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        return helper(i,s,sign,0);
    }
    public int helper(int index,String s,int sign, long ans){
        if(index>=s.length()||!Character.isDigit(s.charAt(index))){
            return (int)(sign*ans);
        }
        ans=ans*10+(s.charAt(index)-'0');
        if (sign * ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign * ans >=  Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return helper(index+1,s,sign,ans);
    }
}