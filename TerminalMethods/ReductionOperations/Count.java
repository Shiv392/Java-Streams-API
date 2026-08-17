package TerminalMethods.ReductionOperations;

import java.util.stream.Stream;

//stream.count() ---> return number of element present in the stream; 
public class Count {
    public static void main(String[]args){
        Stream<Integer>stream = Stream.of(10, 20, 30, 40, 50);
        long streamCnt = stream.count();
        System.out.println("Count: "+streamCnt);
    }
}
