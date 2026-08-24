package Easy;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {

        //in simple array 
        int[] arr = {1,2,3,4,5};
        long sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
        System.out.println("Sum of the array: "+ sum);

        //to the list of numbers
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
         //using reduce
         long sum2 = numbers.stream().reduce(0,(a,b)->a+b);
         System.out.println("Sum of the list numbers: "+sum2);

         //using sum();
        long sum3 = numbers.stream().mapToInt(Integer::intValue).sum();
          System.out.println(sum3);

        
    }
}
