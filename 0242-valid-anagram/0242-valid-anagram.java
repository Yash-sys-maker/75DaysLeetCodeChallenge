class Solution {
    public boolean isAnagram(String s, String t) {

         if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Solution va = new Solution();
        System.out.println(va.isAnagram("anagram", "nagaram")); 
        System.out.println(va.isAnagram("rat", "car"));         
        
    }
}