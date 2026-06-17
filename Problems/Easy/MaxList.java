package Easy;

import java.util.List;
import java.util.stream.Stream;

public class MaxList{
    public static void main(String[]args){
         List<Integer>list = List.of(1,2,5,1,2,4);
         int max = list.stream().max((a,b)->a.compareTo(b)).orElse(100);
         System.out.println("max: "+max);
    }
}