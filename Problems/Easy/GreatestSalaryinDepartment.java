package Easy;

//find name of the employee with greatest slaary 
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class GreatestSalaryinDepartment {
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

//average of employee of department Developemnt 
  double DevSalarySum = employeeList.stream().filter(e-> "Development".equals(e.getDepartment())).mapToDouble(Employee::getSalary).sum();
  System.out.println("sum of the development team salary: "+DevSalarySum);

  //maximum salary with departent development
  String maxSalaryDev = employeeList.stream().filter(e-> "Development".equals(e.getDepartment()))
  .max(Comparator.comparingDouble(Employee::getSalary)).map(e-> e.getName()).orElse("no employee found");
  System.out.println("Maximum salary dev name: "+maxSalaryDev);
    }
}