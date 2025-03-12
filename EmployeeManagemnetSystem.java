import java.util.ArrayList;  
import java.util.List;  

class Employee {  
    private int id;  
    private String name;  
    private double salary;    
    public Employee(int id, String name, double salary) {  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
    public void displayDetails() {  
        System.out.println("Employee ID: " + id);  
        System.out.println("Employee Name: " + name);  
        System.out.println("Employee Salary: $" + salary);  
        System.out.println("-------------------------");  
    }  
}  

public class Main{  
    public static void main(String[] args) {  
        List<Employee> employees = new ArrayList<>();  

        employees.add(new Employee(1, "Alice", 50000));  
        employees.add(new Employee(2, "Bob", 60000));  
        employees.add(new Employee(3, "Charlie", 70000));  

  
        for (Employee employee : employees) {  
            employee.displayDetails();  
        }  
    }  
}  
