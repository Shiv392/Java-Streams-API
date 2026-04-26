package IntermidiateMethods;

import java.util.stream.Stream;

public class LimitClass {
    public static void main(String[] args) {
        //limit returns then specified number of element from the streams
        Stream<Integer>stream = Stream.of(10,20,30,40,50,60,70);

        PrintStream(stream.limit(4)); //will only returns 4 element from the streams 

    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
    }
}
