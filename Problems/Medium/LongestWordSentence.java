//find the longest word from the sentence 

package Medium/Problems;

import java.util.Arrays;


public class LongestWordSentence{
    public static void main(String[]args){
        String sentence = "Java Stream API is very powerful";
        String longestWord = Arrays.stream(sentence.split(" "))
        .sorted((word1, word2)->word2.length()-word1.length()).
        findFirst().orElse("");

        System.out.println("Longest Word : "+longestWord);

        //using method refernce 
        String longestWord2 = Arrays.stream(sentence.split(" "))
        .max(Comparator.comparingInt(String::length)).orElse("");

        //powerfull 
    }
}