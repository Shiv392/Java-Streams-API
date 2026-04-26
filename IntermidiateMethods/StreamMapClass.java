package IntermidiateMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMapClass {
    public static void main(String[] args) {
        //map() add operation to each element of the streams
        //like multiply each element by 2 or likewise.

        Integer[] arr = {1,2,3,4,5};

        Stream<Integer>mapStream = Arrays.stream(arr).map(num-> num*2);
        PrintStream(mapStream);
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
