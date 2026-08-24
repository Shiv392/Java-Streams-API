//program to create a map from the list of string
//here key would be list vlaue and value would be length of the key

package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFromList{
    public static void main(String[]args){
        List<String>list = Arrays.asList("Java", "Stream", "API");

        Map<String, Integer>map = list.stream().
        collect(Collectors.toMap(
          name -> name,
          name-> name.length()
        ));

        System.out.println(map);
    }
}