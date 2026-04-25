package IntermidiateMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapClass {
    public static void main(String[] args) {
        List<List<Integer>>list = new ArrayList<>();
        list.add(List.of(1,2,3));
        list.add(List.of(4,5,6));
        list.add(List.of(7,8,9));

        //flatMap() used to flat nested list into single list
        Stream<Integer>flatStream = list.stream().flatMap(innerList-> innerList.stream());
        PrintStream(flatStream);
    }

    public static void PrintStream(Stream<Integer>stream){
        stream.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
