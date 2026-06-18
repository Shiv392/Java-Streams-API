package Medium/Problems;

//program to group string by their length;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength{
    public static void main(String[]args){
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");

        //using groupingBy;

        Map<Integer, List<String>>ans = words.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(ans);

        // {
        // 3=[API, Fun], 
        // 4=[Java, Code], 
        // 6=[Stream]
        // }

        
    }
}