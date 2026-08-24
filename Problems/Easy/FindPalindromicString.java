package Easy;

//progarm to find all palindromic string 

import java.util.Arrays;
import java.util.List;

public class FindPalindromicString{
    public static void main(String[]args){
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    int evenSquareSum = numbers.stream().filter(num-> num%2==0)
    .mapToInt(num-> num*num).sum();

    System.out.println(evenSquareSum);

    //56
    }
}