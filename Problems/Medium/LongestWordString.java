package Medium;

//find wordd with longest length;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordString{
    public static void main(String[]args){
        List<String>strings = Arrays.asList("Amazone","Google","Microsoft","Salesforce");

        //Using sorting
        String longestWord = strings.stream().sorted(Comparator.comparing(String::length))
        .findFirst().orElse(" ");
        System.out.println("Longest word using sorting: "+longestWord);
        
        //using max and method referece
        String longestWord2 = strings.stream().max(Comparator.comparing(String::length))
        .orElse("");
        System.out.println("Longest word using Max: "+longestWord2);
    }
}