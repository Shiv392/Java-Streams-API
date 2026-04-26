package TerminalMethods;

import java.util.stream.Stream;

public class AnyMatchClass {
    public static void main(String[] args) {
        
        //anyMatch() return true if any of the element matches the given condition else retunr false;
        boolean check = Stream.of(1,2,3,4,5).anyMatch(num-> num%2==0);
        System.out.println("Stream has even number: "+ check);
    }
}
