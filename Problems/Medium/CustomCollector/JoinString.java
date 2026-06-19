package CustomCollector/Medium/Problems;

//custom collector to join list elmeent with delimiter

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinString{
    public static void main(String[]args){
        List<String> words = Arrays.asList("Java", "Stream", "API");

        String joined = words.stream().collect(Collectors.joining("+"));
        System.out.println(joined);
    }
}