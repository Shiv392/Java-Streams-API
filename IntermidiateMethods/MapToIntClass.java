package IntermidiateMethods;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class MapToIntClass{
    public static void main(String[]args){
        Integer[]arr = {1,2,3,4,5};
        Stream<Integer>stream = Arrays.stream(arr);

        //mapToInt() : Convert Non premetive into premitive int type.
        //convert generic stream into specialize Premetive IntStream.
        //same with mapToLong() & mapToDouble also
        //mapToInt() : returns IntStream, gives access to built in math methods
        //like sum(), average(), min() & max();

       int sum = stream.mapToInt(x-> x).sum();
       int min = stream.mapToInt(x-> x).min();
       int max = stream.mapToInt(x->x).max();

       //2 example : Parsing Strings to integers
       List<String>numericStrings = List.of("10","20","30");
       int sum = numericStrings.stream().mapToInt(Integer::parseInt).sum();
       System.out.println("sum of string numbers: "+sum);
    }
}

//why important
//1. avoid autoboxing
//2. performance boost 
//3. avoid 

//key rules 
//1. It doesn't execute immidiatly, it simply retuns new IntStream that can be used by 
//terminal operators like sum(), min() or etc.
//2. 