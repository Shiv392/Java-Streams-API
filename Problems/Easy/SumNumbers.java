package Problems.Easy;

import java.util.Arrays;

public class SumNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        long sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
        System.out.println("Sum of the array: "+ sum);

        
    }
}
