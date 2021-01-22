Word Composition Problem:

Worst Time Complexity: **O(n<sup>2</sup> s<sup>3</sup>)**, where n is total number of words and s is the length of longest word.

Space Complexity: **O( S \* N)**, where N is number of words in Trie and S is length of the words.

This is Readme file for the problem given by Impledge Technologies. The **java source code for this gradle app project is in &quot;p1&quot;,** in same folder.This whole project in made using java as programming language.

The Trie Data Structure is used in this program as it has to identify two longest word in file concatenating shorter words, also present in file. Firstly, there is Main class which is contains all the other class to manipulate ArrayList declared in Main class. This Main class uses input function inside Input class to get input from the file given in problem, then they are sorted according to the length in descending order. At last, the whole ArrayList is put through trie data structure and by the help trie manipulation longest word and second longest in list is detected made by concatenation.

So, solution have been divided the program into 3 parts to make understandable for the others.

1. Reading words from given text files: In this part users inputs choice of file to be used for scanning for words and using File class the file is stored in as object of File class. Now, using Scanner class , functions hasNextLine() and nextLine() it is store in string. This string will be used to store the values in data structures. This all will be enclosed inside a while loop. This whole step will have time complexity of O(n), where n is number of words present in file.
2. Storing data into an ArrayList: As words from files are now stored in string simply copy that data into declared ArrayList and sort the ArrayList according to the length of words in descending order.
3. Check the two longest word in files are concatenated or not: Use Trie data structure to store all the words except two words which are to be checked and check it whether those two words are made from concatenation all the other words. The whole time complexity is O(n2s3), where n is total number of words and s is the length of longest word.

To understand design of program we have to look into:

- Main class: This class contains only main function which is driver of the whole program. Inside this main function ArrayList is declared which is manipulated throughout the life cycle of program and function of other classes help it manipulate to get the right output.
- Input class: This class uses input function to get all the input.

- input(ArrayList): This function receives ArrayList as parameter and uses file handaling algorithm to get inputs from &quot;words.txt&quot; and &quot;words1.txt&quot; and then store it to received ArrayList.

- Sorted class: This class uses sortedListByLen to sort the array list.

- sortedListByLen(ArrayList): This function receives ArrayList and then uses Collection.sort() passing list and comparator with nested function which returns difference of string receiving two strings as parameter(this function is named as compare() ) to return sorted ArrayList lengthwise in descending order.

- ConcatenationCheck class: This class gives output after checking all the words for answer using output function.

- utput(): Uses nested loop to insert all the words in trie and using trie functions get to know the result and print them.

- Trie class: This class contains TrieNode static sub-class and methods as following:

- insert(TrieNode, String): This function receives string and TrieNode as parameters. This function is used to insert the string into trie. If not present, inserts key into trie If the key is prefix of trie node, just marks leaf node. Pseudo Code is given below.
- search(TrieNode, String): This function receives string and TrieNode as parameters. This function is used to search the string that it is present in trie or not. At Last, returns true if key presents in trie, else false Pseudo Code is given below.
- wordBreak(String, TrieNode): This function receives string and TrieNode as parameters. Try all prefixes of lengths from 1 to length of string. The parameter for search is str.substring(0, i) which is prefix (of input string) of length &#39;i&#39;. We first check whether current prefix is in dictionary. Then we recursively check for remaining string str.substring(i, size) which is suffix of length size-i. At last returns true if string can be segmented into space separated words, otherwise returns false. Pseudo Code is given below.

Pseudo Code:

- For DefInsert (TrieNode, String):

FOR I=0 TO LENGTH_OF_STRING:

INDEX=STRING(I) – asciiOF(a)

IF(TRIE_NODE(INDEX) == NULL)

NEW TRIE_NODE

TRIE_NODE= NEW_NODE

TRIE_NODE IS =TRUE

- For DefSearch(TrieNode, String):

FOR I=0 TO LENGTH_OF_STRING:

INDEX=STRING(I) – asciiOF(a)

IF(TRIE_NODE(INDEX) == NULL):

Retun FALSE

TRIE_NODE= NEW_NODE

Return (NEW_NODE != NULL AND (NEW_NODE is leaf node))

- For DefWordBreak(String, TrieNode):

FOR I=1 TO LENGTH_OF_STRING:

IF (DefSearch(TTRIE_NODE, SUBSTRING(0,I) AND DefWordBreak(SUBSTRING(I,LENGTH_OF_STRING),ROOT)):

RETURN TRUE

RETURN FALSE

- For DefOutput(ArrayList List):

FOR I =0 TO TOTAL_ELEMENT_IN_LIST:

NEW TRIE_NODE

STRING A= LONGEST WORD

STRING B= 2nd LONGEST WORD

FOR J=0 TO TOTAL_ELEMENT_IN_LIST:

INSERT(EVERY ELEMENT FROM LIST EXCEPT 2 OF THE LONGEST WORD)

IF( DefWordBreak(A, TRIE_NODE) AND DefWordBreak(B, TRIE_NODE)):

PRINT A

PRINT B

How to Open a Gradle app?

1. [Install Gradle.](https://gradle.org/install/)
2. Open Terminal in **word composition problem** folder.
3. Enter &#39;./gradlew run

By,

Manni Bhaskar Mallik(CSE 4th Year),

SDET- Brainware Group of Institutions,

mannibhaskar4@gmail.com,

8102087043
