package Medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private String department;

    public Employee(){};
    
    public Employee(String _name, double _salary, String _department){
        name = _name;
        salary = _salary;
        department = _department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; };
    public double getSalary() { return salary; }
}

public class EmployeeProblems {
        public static void main(String[] args) {
        List<Employee>empList = new ArrayList<>();
        addEmployee(empList);

        //1. filter employees with salary > 1lakh ---------------->
        List<Employee>filterEmp = empList.stream().filter(emp-> emp.getSalary()>100000.0).toList();
        PrintEmpList(filterEmp);

        //2. find highest paid emploee -------------->
        Employee highestPaidEmp = empList.stream().sorted((a,b)-> Double.compare(b.getSalary(), a.getSalary())).findFirst().orElse(new Employee());
        System.out.println("Highest paid employee: "+highestPaidEmp.getName());

        //3. find 2nd highest salary ---------------->
        Employee secondHighSalary = empList.stream().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).
        limit(2).skip(1).findFirst().orElse(new Employee());
        System.out.println("Name of the 2nd highest employee...."+secondHighSalary.getName());

        //4. sort employee by salary ------------------->
        List<Employee>salarySorted = empList.stream().sorted((a,b)->Double.compare(a.getSalary(), b.getSalary()))
        .toList();
        System.out.println("employee sorted by salary======================");
        PrintEmpList(salarySorted);

        //5. Group element by department ------------------->
        Map<String, List<String>>departmentGrouping = empList.stream().collect(
            Collectors.groupingBy(
                Employee :: getDepartment,
                Collectors.mapping(
                    Employee :: getName,
                    Collectors.toList()
                )
            ));

        System.out.println("Grouping by department==========================");
        System.out.println(departmentGrouping);

        //6. Employee with highest salary on each group ----------------->
        Map<String, String>highestSalaryByDepartment = empList.stream()
        .collect(
            Collectors.groupingBy(
                Employee :: getDepartment,
                Collectors.collectingAndThen(
                Collectors.maxBy(
                    Comparator.comparing(Employee::getSalary)
                ),
                employee -> employee.get().getName()
                )
            )
        );
        System.out.println("Employee with highest salary on each group");
        System.out.println(highestSalaryByDepartment);

        //7. Count Employee in each department ----------------------->
        Map<String, Long>countDepartmentEmp = empList.stream()
        .collect(
            Collectors.groupingBy(
                Employee:: getDepartment,
                Collectors.counting()
            )
        );
        System.out.println("Department with employee count=====================");
        System.out.println(countDepartmentEmp);

        //8. partition based on employee salary --------------------->
        Map<Boolean, List<String>>partitionEmployee = empList.stream()
        .collect(
            Collectors.partitioningBy(
                emp-> emp.getSalary()<=80000.00,
                Collectors.mapping(
                    Employee:: getName,
                    Collectors.toList()
                )
            )
        );
        System.out.println("Partitioning by salary===============");
        System.out.println(partitionEmployee);

    }

    public static void PrintEmpList(List<Employee>list){
        list.forEach((Employee e)->{
            System.out.println("Name: "+e.getName()+" "+"Department: "+e.getDepartment()+" "+
        "Salary: "+e.getSalary()
        );
        });
    }

    public static void addEmployee(List<Employee>empList){
    empList.add(new Employee("Shiv Soni", 100000.00, "Development"));
    empList.add(new Employee("Rahul Sharma", 85000.00, "Development"));
    empList.add(new Employee("Amit Verma", 75000.00, "QA"));
    empList.add(new Employee("Priya Singh", 95000.00, "Development"));
    empList.add(new Employee("Rohit Gupta", 65000.00, "Support"));
    empList.add(new Employee("Neha Patel", 120000.00, "Management"));
    empList.add(new Employee("Arjun Mehta", 70000.00, "QA"));
    empList.add(new Employee("Ananya Rao", 80000.00, "Support"));
    empList.add(new Employee("Vikram Joshi", 110000.00, "Management"));
    empList.add(new Employee("Pooja Agarwal", 90000.00, "HR"));

    empList.add(new Employee("Karan Malhotra", 88000.00, "Development"));
    empList.add(new Employee("Sneha Iyer", 72000.00, "QA"));
    empList.add(new Employee("Aditya Nair", 105000.00, "Development"));
    empList.add(new Employee("Kavya Reddy", 78000.00, "Support"));
    empList.add(new Employee("Saurabh Mishra", 115000.00, "Management"));
    empList.add(new Employee("Riya Kapoor", 92000.00, "HR"));
    empList.add(new Employee("Manish Yadav", 68000.00, "Support"));
    empList.add(new Employee("Divya Menon", 98000.00, "Development"));
    empList.add(new Employee("Akash Kulkarni", 83000.00, "QA"));
    empList.add(new Employee("Ishita Das", 76000.00, "HR"));
    }
}
