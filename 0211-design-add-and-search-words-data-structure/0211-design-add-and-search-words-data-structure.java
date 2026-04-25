class WordDictionary {
  
    private TrieNode root;
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26]; 
        boolean isEndOfWord = false; 
    }
 
    public WordDictionary() {
        root = new TrieNode();
    }
    public void addWord(String word) {
        TrieNode curr = root;
     
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a'; 
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode(); 
            }
            curr = curr.children[index]; 
        }
        curr.isEndOfWord = true; 
    }

    public boolean search(String word) {
        return helper(word, 0, root);
    }

    private boolean helper(String word, int pos, TrieNode curr) {
        if (curr == null) return false;


        if (pos == word.length()) {
            return curr.isEndOfWord;
        }

        char ch = word.charAt(pos);

    
        if (ch == '.') {
        
            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    if (helper(word, pos + 1, curr.children[i])) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            int index = ch - 'a';
            return helper(word, pos + 1, curr.children[index]);
        }
    }
}
