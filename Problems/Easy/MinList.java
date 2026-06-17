package Easy;

import java.util.List;
import java.util.stream.Stream;

public class MinList{
    public static void main(String[]args){
         List<Integer>list = List.of(1,2,5,1,2,4);
         int max = list.stream().min((a,b)->a.compareTo(b)).orElse(Integer.MIN_VALUE);
         System.out.println("max: "+max);
    }
}