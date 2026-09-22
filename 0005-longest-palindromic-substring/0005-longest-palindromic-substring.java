class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int j = 0; j < s.length(); j++) {
          
            int len1 = expandFromCenter(s, j, j);
          
            int len2 = expandFromCenter(s, j, j + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = j - (len - 1) / 2;
                int i = j;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
