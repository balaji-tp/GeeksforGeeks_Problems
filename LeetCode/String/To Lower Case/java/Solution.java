class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase to lowercase by adding 32
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
