package IntermidiateMethods;

import java.util.List;

//parallelStream basically breaks streams into sub part
//then execute this different Cores of the CPU concurrently 
//internally it used ForkJoinPool.commonPool() so that they can use multi-core processor
//to complete large data processing. 

//how parallelStreams Works : 
//1. Split(Splitterator) : first break large collection into small parts
//2. Execute(ForkJoin) : difference CPU cores works in this parts at the same time.
//3. Combine(Reduce) : all Cores combines altogher to return complete value. 

public class ParellelStreamClass{
    public static void main(String[]args){
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     System.out.println("Sequential Stream: ------->");
     Stream<Integer>streams = numbers.stream().map(n-> n*n);
     //here it will print Stream sequencecly like 
     //1, 4,9 etc and thread name is main thread. 
     PrintStram(streams);

     System.out.println("Parallel Stream: ------------>");
     Stream<Integer>parallelStream = numbers.parallelStream().map(num-> num*num);
     //here it will print stream in uneven order also thread name will be change for each stream 
     PrintStram(parallelStream);
    }

    public static void PrintStram(Stream<Integer>stream){
      stream.forEach(num-> System.out.println("Thread: " + Thread.currentThread().getName() + " -> Value: " + num)));
    }
}

//when to use
//1. for large data set like millions of records
//2. execution time matters more then orders
//3. when we have multi-core processor. 

//when not to use 
//1. if order execution matters
//2. in case of race conditon and statefull streams 