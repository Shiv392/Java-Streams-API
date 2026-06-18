package Medium/Problems;

//count frequency of each character

import java.util.List;
import java.util.Arrays;

public class CharFrequency{
    public static void main(String[]args){
        String name = "Salesforce";

      String name = "Salesforce";
      Map<Character, Long>frequencyMap = name.chars().mapToObj(c-> (char)c)
      .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

      System.out.println(frequencyMap);
    }
}