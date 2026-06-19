package Medium/Problems;

//progarm to filter entries with values greater then 10 and 
//collect 

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FindPalindromicString{
    public static void main(String[]args){
    Map<String, Integer>map = Map.of("A",5, "B",15, "C",10, "D",20);

    List<String>keys = map.entrySet().stream().
    filter(entry-> entry.getValue()>=10)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());

    System.out.println(keys);

    // [D, C, B]
    }
}