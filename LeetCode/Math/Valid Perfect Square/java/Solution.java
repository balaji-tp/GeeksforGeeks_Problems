class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long low=1,high=num/2;
        while(low<=high){
            long mid=low+(high-low)/2;
            long sq=mid*mid;
            if(sq==num) return true;
            else if(sq>num) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}