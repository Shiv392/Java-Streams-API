//program to remove null values 
package Medium/Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull{
    public static void main(String[]args){
        List<String>list = Arrays.asList("Java", null, "Stream", null, "API");

        List<String>nonNullList = list.stream().filter(Objects::nonNull)
        .collect(Collectors.toList());

        System.out.println(nonNullList);
    }
}