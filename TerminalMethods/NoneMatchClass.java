package TerminalMethods;

import java.util.stream.Stream;

public class NoneMatchClass {
    public static void main(String[] args) {
        
        //noneMatch() return true when none of the element matches the condition.
        boolean check = Stream.of(1,2,3,4).noneMatch(num-> num<0);
        System.out.println("All element less then 0: "+ check);
    }
}
