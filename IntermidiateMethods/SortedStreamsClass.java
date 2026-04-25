package IntermidiateMethods;

import java.util.stream.Stream;

public class SortedStreamsClass {
    public static void main(String[] args) {
        Stream<Integer>stream = Stream.of(50,10,20,10,30,100,200);

        PrintStream(stream.sorted());
        // PrintStream(stream.sorted((a,b)-> b-a)); //decreasing order 

    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
    }
}
