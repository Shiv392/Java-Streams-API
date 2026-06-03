package TerminalMethods;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstClass {
    public static void main(String[] args) {

        //findFirst() return the Optional<T>;
        //Optional interface show that this value may has or may not have values.
        //Optional interface have ifPresent and empty methods  
        Optional<Integer>FindFirst = Stream.of(1,2,3,4).findFirst();
        FindFirst.ifPresent(System.out::println);

        //without optional we can also use orElse method with value; 
        int firstEven = Stream.of(1,1,2,4).filter(num-> num%2==0).findFirst().orElse(-1);
        System.out.println("First even number: "+firstEven);
    }
}
