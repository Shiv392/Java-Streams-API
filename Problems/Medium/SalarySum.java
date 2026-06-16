package Medium;

import java.util.stream.Stream;
import java.util.List;

public class SalarySum {
 public static class Person{
  private String name;
  private int age;
  private double salary;
  Person(String name, int age, double salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public double getSalary(){return this.salary;}
  }

    public static void main(String[] args) {
     List<Person>personList = new ArrayList<>();
     personList.add(new Person("Shiv",25, 100000.00));
     personList.add(new Person("Soni",26, 5000.00));
     personList.add(new Person("Peter",20, 349494.00));

     double totalSalary = personList.stream().filter(person-> person.getAge()>20).map(Person::getSalary).reduce(0.0,(a,b)->a+b);
     System.out.println("total Salary: "+totalSalary);

     //uisng mapToDouble and sum();
     double totalSal = personList.stream().mapToDouble(Person::getSalary).sum();
     System.out.println("Total Salary: "+totalSal);
    }
    public static void PrintStream(Stream<Person>personStream){
      personStream.forEach(person-> System.out.println("Name: "+person.getName()+", "+"Age: "+person.getAge()+" "));
      System.out.println("");
    }
}