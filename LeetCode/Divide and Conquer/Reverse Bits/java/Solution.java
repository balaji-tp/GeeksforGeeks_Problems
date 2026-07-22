class Solution {
    // you must reverse exactly 32 bits
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // shift result left to make space
            result <<= 1;
            // extract last bit of n and add it to result
            result |= (n & 1);
            // shift n right to process the next bit
            n >>= 1;
        }
        
        return result;
    }
}
