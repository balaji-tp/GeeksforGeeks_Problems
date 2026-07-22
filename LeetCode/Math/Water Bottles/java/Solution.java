class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;  
        int empty = numBottles;  

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;  
            drunk += newBottles;                  
            empty = newBottles + (empty % numExchange); 
        }

        return drunk;
    }
}
