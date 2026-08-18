package Medium;

import java.util.stream.Collectors;
import java.util.Map;

//Count freqnuency of each character in the string 
public class CharFrequency{
    public static void main(String[]args){
      String name = "Salesforce";
      //chars()-> return char with their ASCII/Unicode value like a->65 like
      //mapToObj -> convert uniCode to their character to get Stream<Character>
      //Now apply groupingBy with their c and Collectors.counting()
      Map<Character, Long>frequencyMap = name.chars().mapToObj(c-> (char)c)
      .collect(
        Collectors.groupingBy(c-> 
            c, Collectors.counting()
        )
        );
      System.out.println(frequencyMap);
    }
}