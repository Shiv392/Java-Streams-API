package TerminalMethods;

import java.util.stream.Stream;

public class ForEachClass {
    public static void main(String[] args) {
        Stream<Integer>stream = Stream.of(1,2,3,4,5,6,2,1,0,0);

        //forEach method used to print the elents of the stream
        stream.forEach(System.out::print);
    }
}
