package Medium;

import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class FindMinAge {
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
     PrintStream(personStream);

     Person smallerPerson = personList.stream().min(Comparator.comparingInt(Person :: getAge)).orElse(null);
     if(smallerPerson!=null){ //to avoid null pointer excetpion error while run time 
     System.out.println("Name of the smalleest age person: "+smallerPerson.getName());
     }

     String smallerName = personList.stream().min(Comparator.comparingInt(Person::getAge))
     .map(Person::getName).orElse("No person found");
     System.out.println("Name of younger employee: "+smallerName);

    }
    public static void PrintStream(Stream<Person>personStream){
      personStream.forEach(person-> System.out.println("Name: "+person.getName()+", "+"Age: "+person.getAge()+" "));
      System.out.println("");
    }
}