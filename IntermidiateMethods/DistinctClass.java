package IntermidiateMethods;

import java.util.stream.Stream;

public class DistinctClass {
    public static void main(String[] args) {
        
        Stream<Integer>stream = Stream.of(10,20,30,30,40,40,50);
        PrintStream(stream.distinct());
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
