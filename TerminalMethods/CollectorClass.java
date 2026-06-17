package TerminalMethods;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// collect() is a terminal operation that accumulates stream elements into a collection or another result container such as List, Set, Map, or grouped data.

public class CollectorClass {
    public static void main(String[] args) {

        //creating list from the stream collecitons
        List<Integer>list  = Stream.of(1,2,3,4,5,6,7,8).collect(Collectors.toList());
        System.out.println("Printing list from stream");
        list.forEach(System.out::print);
        System.out.println();

        //converting Stream to set
        Set<Integer>streamset = Stream.of(1,1,2,2,3,4,5).collect(Collectors.toSet());
        System.out.println("Printing set from stream");
        streamset.forEach(System.out::print);
        System.out.println();


        //stream to map
        Map<Integer, String>map = Stream.of(1,2,3,4,5).collect(Collectors.toMap(num-> num, num-> "value"+num)); 
        System.out.println("Printing map from stream");
        map.keySet().forEach(num-> System.out.println("key: "+num + " "+"value: "+map.get(num)));  
        System.out.println();

        //joining for string
        String StreamString = Stream.of("A", "B","C","D").collect(Collectors.joining(","));
        System.out.println("String from Stream join: "+ StreamString);

        //counting() return the element in the stream
        long count = Stream.of(1,2,3,4,5,6,6).collect(Collectors.counting());
        System.out.println("Counting method : "+count);

        //GroupingBy() : group elements with given condition
        Map<Boolean, List<Integer>>GroupMap = Stream.of(1,2,3,4,5).collect(Collectors.groupingBy(num-> num%2==0));
        GroupMap.keySet().forEach(num-> System.out.println("key: "+num + " "+"value: "+GroupMap.get(num)));
    
    }
}
