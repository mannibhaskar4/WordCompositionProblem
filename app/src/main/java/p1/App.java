/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package p1;
import java.util.*;
import java.io.*;
import utilities.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        /** Declared ArrayList */
        ArrayList<String> list = new ArrayList<String>();
        /** Got Input from text files through this class */
        Input.input(list);
        /** Sorted the the ArrayList in decsecind order by length */
        Sorted.sortedListByLen(list);

        ConcatenationCheck.output(list);



        

    }
}
