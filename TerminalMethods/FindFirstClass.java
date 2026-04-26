package TerminalMethods;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstClass {
    public static void main(String[] args) {

        //findFirst() return the first element of the stream
        Optional<Integer>FindFirst = Stream.of(1,2,3,4).findFirst();
        FindFirst.ifPresent(System.out::println);
    }
}
