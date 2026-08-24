package Easy;

import java.util.List;
import java.util.Arrays;

public class CountPrefixString{
    public static void main(String[]args){

        List<String>list = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");

        Long count = list.stream().filter(name-> name.startsWith("A")).count();
        System.out.println("Counting: "+count);
    }
}