package utilities;

import java.util.*;

public class Sorted {
    /** Sorting Arraylist in descending order according to length */
    public static void sortedListByLen(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }

        });

    }
}
