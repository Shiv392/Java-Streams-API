package IntermidiateMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterClass {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};

        //filter() : filterout streams
        Stream<Integer>evenStreams = Arrays.stream(arr).filter(num-> num%2==0);
        PrintStreams(evenStreams);

        //filterout even steams
        Stream<Integer>oddStream = Arrays.stream(arr).filter(num-> num%2!=0);
        PrintStreams(oddStream);
    }

    public static void PrintStreams(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
    }
}
