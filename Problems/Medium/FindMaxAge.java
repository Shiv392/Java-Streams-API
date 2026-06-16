import java.util.*;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Stack;
import java.util.Comparator;

//program to find Person name with maximum age ; 

public class Main {
 public static class Person{
  private String name;
  private int age;
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
}
    public static void main(String[] args) {
     List<Person>personList = new ArrayList<>();
     personList.add(new Person("Shiv",25));
     personList.add(new Person("Soni",26));
     personList.add(new Person("Peter",20));

     Stream<Person>personStream = personList.stream();
     Person person = personStream.max(Comparator.comparingInt(Person::getAge)).orElse(null);
     if(person!=null){;
      System.out.println("person with max age: "+person.getName());
     }

      //production ready Code
     String personName = personList.stream().max(Comparator.comparingInt(Person::getAge)).map(Person::getName).orElse("No person found");
     System.out.println("person with maximum age name : "+personName);

     //using lambda expression 
    String personName2 = personList.stream().max((p1, p2)-> Integer.compare(p1.getAge(), p2.getAge()))
      .map(p-> p.getName()).orElse("No person found");
      System.out.println("person with maximum age: "+personName2);

    }
    public static void PrintStream(Stream<Person>personStream){
      personStream.forEach(person-> System.out.println("Name: "+person.getName()+", "+"Age: "+person.getAge()+" "));
      System.out.println("");
    }
}