package Medium/Problems;

//programe to find employee name with their frequency

import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;

public class NameFrequency{
    public static void main(String[]args){
        List<String>nameList = List.of("Shiv","Soni","Shiv","Soni","Raipur","Salesforce", "Google",
            "EPAM","Salesforce","Amazon","Microsoft"
        );

        //using Hashmpa
        Map<String, Integer>map = new HashMap<>();
        for(String name : nameList){
          map.put(name, map.getOrDefault(name,0)+1);
        }

        for(Map.Entry<String, Integer>entry : map.entrySet()){
          System.out.println("name: "+entry.getKey()+" "+"Frequency: "+entry.getValue());
        }

        //using stream
        Map<String, Long>frequencyMap = nameList.stream().collect(Collectors.groupingBy(
          name -> name,
          Collectors.counting()
        ));
        System.out.println(frequencyMap);
        
    }
}