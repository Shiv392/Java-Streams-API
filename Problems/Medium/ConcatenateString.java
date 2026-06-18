package Medium/Problems;

//return concatenate version of the given string list

import java.util.Arrays;
import java.util.List;

public class ConcatenateString{
    public static void main(String[]args){
        List<String>strings = Arrays.asList("Amazone","Google","Microsoft","Salesforce");

        String concatenated = strings.stream().reduce("",(s1, s2)-> s1+" "+s2).trim();
        System.out.println(concatenated);
    }
}