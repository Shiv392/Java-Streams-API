package TerminalMethods;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyClass {
    public static void main(String[] args) {
        
        //findAny() return the random value from the stream
        Optional<Integer>FindAnyValue = Stream.of(1,2,3,4).findAny();
        FindAnyValue.ifPresent(System.out::println);
    }
}
