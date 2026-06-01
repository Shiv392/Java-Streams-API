package IntermidiateMethods;

import java.util.Arrays;
import java.util.stream.Stream;

//stream.map(callback function) : map() method is used to perform some operation on each element of the 
//stream and returns new stream with modified element.

public class StreamMapClass {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};

        Stream<Integer>mapStream = Arrays.stream(arr).map(num-> num*2);
        PrintStream(mapStream);
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
