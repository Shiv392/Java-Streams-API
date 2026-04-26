package TerminalMethods;

import java.util.stream.Stream;

public class AllMatchClass {
    public static void main(String[] args) {
        
        //allMatch() return true if each element in the stream matches the condition.
        boolean check = Stream.of(1,2,3,4).allMatch(num-> num>2);
        System.out.println("All element greater then 2: "+check);
    }
}
