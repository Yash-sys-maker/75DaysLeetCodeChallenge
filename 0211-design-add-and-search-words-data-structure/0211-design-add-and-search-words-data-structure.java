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
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

  
    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word, int pos, TrieNode node) {
        if (node == null) return false;
        if (pos == word.length()) return node.isEndOfWord;

        char c = word.charAt(pos);
        if (c == '.') {
       
            for (TrieNode child : node.children) {
                if (child != null && searchHelper(word, pos + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = c - 'a';
            return searchHelper(word, pos + 1, node.children[index]);
        }
    }
}
