package TerminalMethods;

import java.util.stream.Stream;

public class CountClass {
    public static void main(String[] args) {
        Stream<Integer>stream = Stream.of(1,2,3,4,5,6,7,1,0,0,0);

        //Count() return the number of element in the streams in long type 
        long size = stream.count();
        System.out.println(":Size of the stream:"+" "+size);
    }
}
