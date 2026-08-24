package Easy;

import java.util.Arrays;

public class EvenNumberAverage{
    public static void main(String[]args){
     int[]arr = {1,2,3,4,5,6,7,8,9,0};
     double avg = Arrays.stream(arr).average().orElse(0.0);
     System.out.println("average: "+avg);

     //or
     //this might give run time erro of null value if streams is empty, prefere 1st one
     Integer[]arr2 = {4,4,5,5,4,1};
     double avg2 = Arrays.stream(arr2).mapToInt(num-> num).average().getAsDouble();
     System.out.println("average2 : " +avg2);
    }
}