package TerminalMethods.ReductionOperations;

//sum() used to return signal value of the stream i.e sum of the stream elements.
//it returns value not optionalValue so no need to use orElse here.
//to use sum(), first we have to convert into mapToInt() | mapToDouble() | maptoLong();
//get the sum of salary of the development department employee. 
import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static class Employee{
      private String name;
      private double salary;
      private String department;

      public Employee(String name, double salary, String department){
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

//average of employee of department Developemnt 
  double DevSalarySum = employeeList.stream().filter(e-> "Development".equals(e.getDepartment())).mapToDouble(Employee::getSalary).sum();
  System.out.println("sum of the development team salary: "+DevSalarySum);
    }
}