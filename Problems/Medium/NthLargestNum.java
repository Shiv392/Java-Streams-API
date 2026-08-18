package Medium;

//program to find nth largest element in the list;

import java.util.Arrays;
import java.util.List;

public class NthLargestNum{
    public static void main(String[]args){
          int n = 3;
          List<Integer>numbers = Arrays.asList(5,2,3,1,4,1,2);

          //nth largest element : also use distinct to remove duplicate 
          //element otherwise order may be sorted and could return wrong answer. 
          int kthLargest =  numbers.stream().distinct().sorted((a,b)->b.compareTo(a))
          .skip(n-1).findFirst().orElse(0);

          System.out.println(kthLargest);
    }
}