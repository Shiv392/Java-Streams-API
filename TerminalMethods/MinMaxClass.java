package TerminalMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class MinMaxClass {
    public static void main(String[] args) {
        
        //min() return the min element from the streams.

        //here min() works differently for primitive and non primivite data type. 
        //if stream is intStream(premetive ) then we can directly convert this using getAsInt();
        //int[] → IntStream → OptionalInt → getAsInt() ✅
        int[] arr = {1,2,3};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min element from intStream: "+min);
        //here if arrays is empty so min() return throw expections that's why we can use orElse();
        int min2 = Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
        System.out.println("Min element from intStream: "+min2);
        
        //with doubleStream & longStrem 
        long[] longArr = {10,20,230,0};
        long longMin = Arrays.stream(longArr).min().orElse(Long.MAX_VALUE);
        System.out.println("Long min : "+ longMin);


        //if stream is non-premitive like object then we have to first convert with mapping. 
        //for object java doesn't know their comparison function that's why we need to pass comparator method. 
        int nonpremitive_min = Stream.of(10,1,3,5).min((Integer::compareTo)).orElse(Integer.MIN_VALUE);
        System.out.println("Non Premitive min value using comparator method : "+nonpremitive_min);

        //here Comparator Integer:compareTo return either 1 , 0, -1 and we can also use this like 
        //.min((a,b)-> a.compareTo(b));
         int nonpremitive_min2 = Stream.of(10,1,3,5).min((a,b)-> a.compareTo(b)).orElse(Integer.MIN_VALUE);
         System.out.println("Using CompareTo method: "+ nonpremitive_min2);

         //get the max value
         int nonpremitive_max = Stream.of(1,2,3,4,110, 20).max((a,b)-> a.compareTo(b)).orElse(Integer.MAX_VALUE);
         System.out.println("Using Compre to method maximum: "+nonpremitive_max);
    }
}
