package Medium/Problems;

//Reverse each string i nthe list 

import java.util.Arrays;
import java.util.List;

public class ReverseString{
    public static void main(String[]args){
        List<String> words = Arrays.asList("Java", "Stream", "API");

        List<String>reverseWords = words.stream().
        map(word-> new StringBuilder(word).reverse().toString())
        .collect(Collectors.toList());

        System.out.println(reverseWords);

        //[avaJ, maertS, IPA]
    }
}