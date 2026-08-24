package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNums {
    public static void main(String[] args) {
        //with premitive data type
        int[] arr = {1,2,3,4,5,6};

        //here we are using int so filter() return intStream 
        //so we have to convert int to Integer using boxed();
       List<Integer>evenList =  Arrays.stream(arr).filter(num-> num%2==0).boxed()
       .collect(Collectors.toList());

       PrintList(evenList);

       //filters from the Non premetive object type
       //Here Stream filter() retunr direct integer data type so we can directly change this using toList() to list. 
       List<Integer>evenList2 = Stream.of(1,2,3,4,5,6,9,8).filter(num-> num%2==0).toList();
       PrintList(evenList2);

       //from set to list
       Set<Integer>set = Set.of(10,20,21,22,12,40,50);
       List<Integer>setList = set.stream().filter(num-> num%2==0).toList();
       PrintList(setList);
    }

    public static void PrintList(List<Integer>list){
        list.forEach(num-> System.out.print(num+ " "));
        System.out.println();
    }
}   
