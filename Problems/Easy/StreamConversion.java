package Easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamConversion {
    public static void main(String[] args) {

        //1. convert array to stream 
        int[] arr = {1,2,3,4};
        //here Arrays.stream will return intStream but we have to convet this into Integer. 
        // /to convert intStream to Integer, we have to use boxed()
        Stream<Integer>arrStream = Arrays.stream(arr).boxed();
        PrintStream(arrStream);

        //2. conver set to Stream
        Set<Integer>set = Set.of(1,2,3,4);
        Stream<Integer>setStream = set.stream().map(num-> num*2);
        PrintStream(setStream);

        //3. convert string to stream 
        //convert string to stream using char() that returns character streams 
        String name = "ShivSoni";
        Stream<Character>nameStream = name.chars().mapToObj(c-> (char) c);
        nameStream.map(Character :: toUpperCase).forEach(c-> System.out.print(c+ " "));
        System.out.println();

        //4. Streams to list 
        List<Integer>streamList = Stream.of(1,2,3,4,54).toList();
        streamList.forEach(num-> System.out.print(num+ " "));
        System.out.println();

        //5. Steram to set
        Set<Integer>streamSet = Stream.of(10,20,30,40,50).collect(Collectors.toSet());
        streamSet.forEach(num-> System.out.print(num+ " "));
        System.out.println();
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+ " "));
        System.out.println();
    }
}
