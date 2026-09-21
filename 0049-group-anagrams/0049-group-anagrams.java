class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String lock = new String(chars);

            
            map.putIfAbsent(lock, new ArrayList<>());
            map.get(lock).add(word);
        }

        
        return new ArrayList<>(map.values());
    }

   
    public  void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        
    }
}