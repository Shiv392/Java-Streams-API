package StreamMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Set;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Main{
    public static void main(String[] args) {

        //DEFINE streams with default value
        //we can define stream with default value using Stream.of() method. 
        Stream<Integer>streams = Stream.of(10,20,30,40,50);
        
        //1. create streams from array------>
        //we can convert array into stream using Arrays.stream() method. 
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer>arrStream = Arrays.stream(arr);

        //convert arr to intStream
        int[]arr2 = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr2);

        //create stream from int type array
        int[] temparr = {1,2,3};
        //here Arrays.stream(arr) returns <intStream>
        //stream().boxed() convert int type to Integer type 
        Stream<Integer>IntStream = Arrays.stream(temparr).boxed();

        //2. Create stream from collection framework : Arraylist
        //we can convert collection frameword into stream using collection.stream() method. 
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

        //5. converlt string to stream
        String name = "Shiv Soni";
        //convert string to their ASCII code value like a->65 using chars()
        //then convert chars() to mapToObj(char) that will return Stream<Character>
        Stream<Character>charStream = name.chars().mapToObj(c -> (char)c);

        //covert objcet into stream
        Person p1 = new Person("Shiv",22);
        Person p2 = new Person("Soni",23);
        List<Person>personList = List.of(p1, p2);
        Stream<Person>personStream = personList.stream();

        //convert Stream to array list 
        Stream<Integer>stream = Stream.of(1,2,3,4,5);
        //convert usin stream.toList();
        List<Integer>streamList = stream.toList();
        PrintList(streamList);
    }

    public static void PrintList(List<Integer>list){
        list.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}