//find the longest word from the sentence 
package Medium;

import java.util.Arrays;
import java.util.Comparator;


public class LongestWordSentence{
    public static void main(String[]args){

        //approach
        //convert string to stream using Array.stream(string.split(" "))
        //then we can use 
        //sorted to sort by their word length decreasing order then get findFirst
        //2nd is use max by passing comparator method that will work on their length

        String sentence = "Java Stream API is very powerful";
        String longestWord = Arrays.stream(sentence.split(" "))
        .sorted((word1, word2)->Integer.compare(word2.length(), word1.length())).
        findFirst().orElse("");

        System.out.println("Longest Word : "+longestWord);

        //using method refernce 
        String longestWord2 = Arrays.stream(sentence.split(" "))
        .max(Comparator.comparingInt(String::length)).orElse("");

        System.out.println("Using Method referene "+longestWord2);
    }
}