package utilities;

public class Trie {
    static final int ALPHABET_SIZE = 26;

    /** Creating Trie Node for Trie data structure */
    static class TrieNode {
        TrieNode[] child = new TrieNode[ALPHABET_SIZE];

        /**
         * isEndOfWord is true if the node represents end of a word
         */
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                child[i] = null;
            }
        }

    }

    /** Inserstion in Trie Data Structure */
    static void insert(TrieNode root, String Key) {

        int level;
        int len = Key.length();
        int index;

        TrieNode node = root;

        for (level = 0; level < len; level++) {
            index = Key.charAt(level) - 'a';
            if (node.child[index] == null)
                node.child[index] = new TrieNode();

            node = node.child[index];
        }
        /** mark last node as leaf */
        node.isEndOfWord = true;
    }

    /**
     * Search in Trie data Structure if word is there then fuction retrn true else
     * false
     */
    static boolean search(TrieNode root, String key) {
        int level;
        int len = key.length();
        int index;

        TrieNode node = root;

        for (level = 0; level < len; level++) {
            index = key.charAt(level) - 'a';

            if (node.child[index] == null) {
                return false;
            }
            node = node.child[index];

        }

        return (node != null && node.isEndOfWord);

    }

    static boolean wordBreak(String str, Trie.TrieNode root) {
        int len = str.length();
        /** Best Case */
        if (len == 0) {
            return true;
        }

        /*
         * Passing and checking sub-string of String to validate the string if it is
         * made of other string present in text files
         */
        for (int i = 1; i <= len; i++) {
            if (Trie.search(root, str.substring(0, i)) && wordBreak(str.substring(i, len), root))
                return true;
        }
        /**
         * If we have tried all prefixes and none of them worked
         */
        return false;

    }

}
