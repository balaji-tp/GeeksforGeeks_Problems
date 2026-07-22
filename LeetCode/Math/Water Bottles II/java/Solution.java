class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles; 
        int empty = numBottles;

        while (empty >= numExchange) {
           
            empty -= numExchange;   
            numBottles = 1;         
            drunk += numBottles;    
            empty += numBottles;    
            numExchange++;          
        }

        return drunk;
    }
}
