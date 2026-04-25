package IntermidiateMethods;

import java.util.stream.Stream;

public class SkipClass {
     public static void main(String[] args) {
        //skip(number) returns streams by removing specified number of element from left to ight;
        Stream<Integer>stream = Stream.of(10,20,30,40,50,60,70);

        PrintStream(stream.skip(2)); //will skip first 2 from the left to right and returns remaining.  
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
    }   
}
