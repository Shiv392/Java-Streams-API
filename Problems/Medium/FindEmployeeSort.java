package Medium/Problems;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Comparator;

//program to find all employees from the city
//also in sorted orfer

public class Employee{
    private String name, city;
    Employee(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName() { return this.name; }
    public String getCity() { return this.city; }
}

public class FindEmployeeSort{
    public static void main(String[]args){
        List<Employee>list = new ArrayList<>();
        list.add(new Employee("Shiv", "Delhi"));
        list.add(new Employee("Peter", "Mumbai"));
        list.add(new Employee("Alice", "Chennai"));
        list.add(new Employee("John", "Delhi"));
        list.add(new Employee("Emma", "Bangalore"));
        list.add(new Employee("David", "Mumbai"));
        list.add(new Employee("Sophia", "Delhi"));
        list.add(new Employee("Michael", "Pune"));
        list.add(new Employee("Olivia", "Chennai"));
        list.add(new Employee("Bob", "Delhi"));

        private String city = "Delhi";

        List<Employee>ans = list.stream().filter(e-> city.equals(e.getCity()))
        .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        ans.forEach(e-> System.out.print(e.getName()+" "));
    }
}