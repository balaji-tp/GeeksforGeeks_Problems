import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;
        
        // first row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            // first element is always 1
            row.add(1);
            
            // fill middle elements
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // last element is always 1
            row.add(1);
            
            triangle.add(row);
        }
        
        return triangle;
    }
}
