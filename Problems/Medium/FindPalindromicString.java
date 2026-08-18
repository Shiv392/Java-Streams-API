package Medium;

//progarm to find all palindromic string 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindromicString{
    public static void main(String[]args){
    List<String> words = Arrays.asList("radar", "level", "world", "java");
    List<String>palindromString = words.stream()
    .filter(word-> word.equals(new StringBuilder(word).reverse().toString())).
    collect(Collectors.toList());

    System.out.println(palindromString);

    // [radar, level]
    }
}