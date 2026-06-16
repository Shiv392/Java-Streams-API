package Problems.Easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxMin {
    public static void main(String[] args) {
        
        //first get the max number
        int[] arr = {3,4,1,33, 45, 100};

        //here input type is premetive so that we can directly use min() & max method without
        //convert into int also comparator method will also not be required. 
        
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max number from premetive data type: "+max);

        //max number from non premitive data type
        int max2 = Stream.of(100,20,101, 1200).max((a,b)-> a.compareTo(b)).orElse(Integer.MAX_VALUE);
        System.out.println("Max number from non premitive data type: "+max2);

        //min from the premitive data type
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min number from premitive data type: "+ min);

        //min number from the non premitive data type
        int min2 = Stream.of(10,20,15,40,31).min((a,b)-> a.compareTo(b)).orElse(Integer.MIN_VALUE);
        System.out.println("Min number from non premitive data type: "+min2);
    }
}
