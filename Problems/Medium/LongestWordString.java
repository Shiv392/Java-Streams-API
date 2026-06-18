package Medium/Problems;

//find wordd with longest length;

import java.util.Arrays;
import java.util.List;

public class LongestWordString{
    public static void main(String[]args){
        List<String>strings = Arrays.asList("Amazone","Google","Microsoft","Salesforce");

        //using sorting 
        String longestWord = strings.stream().
        sorted((s1,s2)-> s2.length()-s1.length())
        .findFirst().orElse("");

        //without sorting
        String longestWord2 = strings.stream().max(Comparator.comparingInt(String::length))
        .orElse("");

        System.out.println("Longest word: "+longestWord);
    }
}