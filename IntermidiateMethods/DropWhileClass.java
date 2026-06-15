package IntermidiateMethods;

import java.util.List;
import java.util.stream.Stream;

//takeWhile is intermidiate operator that introduced in Java9
//it basically opposite of takeWhile. 
//it drops each element that satifys the condition, then if any element breaks
//then it will take all element from that condition. 

//suppose we have a list 
//List<Integer>list = List.of(1,2,3,4,5,1,2,3);
//now we only have to take when element < 5
//list.stream.takeWhile(num-> num<5)

//here 1<5 drop, 2<5 drop, 3<5 drop, 4<5 drop now 5==5 so condition breaks
//now it will take all element from here output : 5,1,2,3

public class DropWhileClass{
    public static void main(String[]args){
        List<Integer>list = List.of(1,2,3,4,5,2,1);
        Stream<Integer>dropWhileStream = list.stream().dropWhile(num->num<5);
        dropWhile.forEach(System.out::println);

        //output : 5,2,1
    }
}