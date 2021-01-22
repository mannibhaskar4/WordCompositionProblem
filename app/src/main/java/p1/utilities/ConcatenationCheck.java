package utilities;

import java.util.ArrayList;

public class ConcatenationCheck {
    public static void output(ArrayList<String> list) {
        int c1 = 0, c2 = 1;
        for (int i = 0; i < list.size(); i++) {

            /** Declaring Trie data structure */
            Trie.TrieNode root = new Trie.TrieNode();
            /** Getting two of the required words from arraylist */
            String p1 = list.get(c1);
            String p2 = list.get(c2);
            for (int j = 0; j < list.size(); j++) {

                if (c1 != j && c2 != j) {

                    Trie.insert(root, list.get(j));
                }

            }

            if (c1 < list.size() - 2)
                c1++;
            if (c2 < list.size() - 1)
                c2++;
            /*
             * Identifies & displays 2 longest words in the file that can be constructed //
             * by combining (concatenating) shorter words also found in the file
             */
            if (Trie.wordBreak(p1, root) && Trie.wordBreak(p2, root)) {

                System.out.println("1. Compound Word: " + p1);
                System.out.println("2. Compound Word: " + p2);
                break;
            }

        }
    }
}
