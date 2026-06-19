package Easy/Problems;

//progarm to partition with palidrom and non palidrom string 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindromicString{
    public static void main(String[]args){
    List<String> words = Arrays.asList("radar", "level", "java", "stream");

    Map<Boolean, List<String>>partitioned = words.stream()
    .collect(Collectors.partitioningBy(word-> word.equals(new StringBuilder(word).reverse().toString())));

    System.out.println(partitioned);

    // {false=[java, stream], true=[radar, level]}
    }
}