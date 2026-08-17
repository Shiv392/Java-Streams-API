package TerminalMethods;

//groupingBy used to categorized same streams element into specific group.

//like in SQL we use select departmet, count(*) from employee group by department
//same we do using groupingBy

// //systax
// Map<Integer, List<T>>employeeDept = list.stream().collect(Collectors.groupingBy(Employee:: getDepartment));
// //output 
// Development == [a,b,c]
// QA = [p,q]
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class GroupingByClass {
    public static class Employee{
      private String name;
      private double salary;
      private String department;
      Employee(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
      }
      public String getName(){return this.name;}
      public double getSalary(){return this.salary;}
      public String getDepartment(){return this.department;}
    }

    public static void main(String[] args) {
     List<Employee>employeeList = new ArrayList<>();
     employeeList.add(new Employee("ShivSoni", 100000.00, "Development"));
     employeeList.add(new Employee("Peter", 85000.00, "Development"));
     employeeList.add(new Employee("John", 75000.00, "QA"));
     employeeList.add(new Employee("Alice", 95000.00, "Development"));
     employeeList.add(new Employee("Bob", 65000.00, "Support"));
     employeeList.add(new Employee("Emma", 120000.00, "Management"));
     employeeList.add(new Employee("David", 70000.00, "QA"));
     employeeList.add(new Employee("Sophia", 80000.00, "Support"));
     employeeList.add(new Employee("Michael", 110000.00, "Management"));
     employeeList.add(new Employee("Olivia", 90000.00, "HR"));

      Map<String, List<Employee>>departmentGroups = employeeList.stream().collect(
        Collectors.groupingBy(Employee :: getDepartment)
      );

      //it will group with department 
      //output 
      //Developerment = code value 
    //   {QA=[Main$Employee@c387f44, Main$Employee@4e0e2f2a], Support=[Main$Employee@73d16e93, Main$Employee@659e0bfd], Development=[Main$Employee@2a139a55, Main$Employee@15db9742, Main$Employee@6d06d69c], HR=[Main$Employee@7852e922], Management=[Main$Employee@4e25154f, Main$Employee@70dea4e]}
      System.out.println(departmentGroups);

      //2. get department with employee name : mapping collector
      Map<String, List<String>>departmentEmployeeNames = employeeList.stream().
      collect(Collectors.groupingBy(
        Employee :: getDepartment,
        Collectors.mapping(
            Employee :: getName,
            Collectors.toList()
        )
      ));
     System.out.println(departmentEmployeeNames);

     //outuput {QA=[John, David], Support=[Bob, Sophia], Development=[ShivSoni, Peter, Alice], HR=[Olivia], Management=[Emma, Michael]}

     //3. department with employee name and salary
     departmentGroups.forEach((department, employees)->{
        System.out.println("\nDepartment: "+department);

        employees.forEach(e->{
            System.out.println(e.getName()+" "+e.getSalary());
        });
     });

    }
}