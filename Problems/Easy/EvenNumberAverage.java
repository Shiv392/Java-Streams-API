package Easy;

public class EvenNumberAverage{
    public static void main(String[]args){
     Integer[]arr = {1,2,3,4,5,6,7,8,9,0};
     double avg = Arrays.stream(arr).mapToInt(num-> num).average().orElse(0.0);
     System.out.println("average: "+avg);

     //or
     //this might give run time erro of null value if streams is empty, prefere 1st one
     double avg2 = Arrays.stream(arr).mapToInt(num-> num).average().getAsDouble();
     System.out.println("average2 : " +avg2);
    }
}