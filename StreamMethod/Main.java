package StreamMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Set;

class Main{
    public static void main(String[] args) {

        //DEFINE streams with default value
        Stream<Integer>streams = Stream.of(10,20,30,40,50);
        
        //1. create streams from array------>
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer>arrStream = Arrays.stream(arr);

        //2. Create stream from collection framework : Arraylist
        List<Integer>list = List.of(1,2,3,4,5);
        Stream<Integer>listStream = list.stream();

        //3. Create stream from colleciton framework : Linkedlist
        List<Integer>linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);

        Stream<Integer>LinkedListStream = linkedlist.stream();

        //4. Create stream from collection framework : HashSet;
        Set<Integer>set = Set.of(10,30,40,50,60);
        Stream<Integer>setStream = set.stream();
    }
}