package TerminalMethods.ReductionOperations;

import java.util.stream.Stream;

public class ReduceClass {
    public static void main(String[] args) {
        
        //reduce() : works on each element and returns a single value. 
        //here 0 is the starting value and a,b shows element of the stream 
        int sum = Stream.of(1,2,3,4,5).reduce(0, (a,b)->a+b);
        System.out.println("Sum of the stream: "+ sum);

        //multiply all elements
        int products = Stream.of(1,2,3,4).reduce(1,(a,b)-> a*b);
        System.out.println("Multiplication of the stream: "+products);
    }
}
