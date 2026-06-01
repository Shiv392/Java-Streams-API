package IntermidiateMethods;

import java.util.Arrays;
import java.util.stream.Stream;

//filter(callback function) : filterout stream element based on the condition provided in callback function
//and returns new stream with filtered element. 

public class FilterClass {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};

        //even number stream
        Stream<Integer>evenStream = Arrays.stream(arr).filter(num-> num%2==0);
        
        //odd number stream
        Stream<Integer>oddStream = Arrays.stream(arr).filter(num-> num%2!=0);

        PrintStreams(evenStream);
        System.out.println();
        PrintStreams(oddStream);
    }

    public static void PrintStreams(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
    }
}
