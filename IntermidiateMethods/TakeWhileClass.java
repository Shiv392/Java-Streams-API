package IntermidiateMethods;

import java.util.stream.Streams;
import java.util.List;

//takeWhile is intermidiate operator that introduced in Java9
//it basically collect all stream value with a condition.
//if condition is break then it will not further move to next stream data; 

//suppose we have a list 
//List<Integer>list = List.of(1,2,3,4,5,1,2,3);
//now we only have to take when element < 5
//list.stream.takeWhile(num-> num<5)
//now it will take 1,2,3,4 now for 5 conditioin is break so it will
//not even move to the next element to check, it just breaks the stream flow.

//here 1<5 take, 2<5 take, 3<5 take, 4<5 take now 5==5 so condition breaks
//it will not move further into the list.

//difference between takeWhile() & filter():
//filter method reads all elements inside the stream then collect only those matches condition
//takeWhile method reads only elements with condition, if the condition fails, it willl
//not iterate into the stream;

public class TakeWhileClass{
  public static void main(String[]args){
    List<Integer>list = List.of(1,2,3,4,5,1,2,3);
    Stream<Integer>stream = list.stream().takeWhile(num-> num<5);
    PrintStram(stream);

    //output : 1,2,3,4
  }
}