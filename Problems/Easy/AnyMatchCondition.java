package Easy/Problems;

//program to find if any strint matches the condition 
//check if any string contains "API";

import java.util.List;
import java.util.Arrays;

public class AnyMatchCondition.java{
    public static void main(String[]args){
        //anyMatch return true if any of the stream element matches the condition'
        
        List<String>strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean containsAPI = strings.stream().anyMatch(s-> s.contains("API"));

        System.out.println("Contains API: "+containsAPI);

        //output : true 
    }
}