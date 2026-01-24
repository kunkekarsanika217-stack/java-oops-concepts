import java.util.Map;
import java.util.TreeMap;


 // Demonstrates professional usage of TreeMap.
 //TreeMap stores key-value pairs in sorted order of keys.
 
public class TreeMapExample {

    public static void main(String[] args) {

        // TreeMap maintains natural ascending order of keys
        Map<Integer, Employee> employeeMap = new TreeMap<>();

        // Adding entries to TreeMap
        employeeMap.put(103, new Employee(103, "Rohit", "IT", 65000));
        employeeMap.put(101, new Employee(101, "Sanika", "HR", 55000));
        employeeMap.put(105, new Employee(105, "Amit", "Finance", 70000));
        employeeMap.put(102, new Employee(102, "Neha", "Marketing", 60000));

        // Displaying TreeMap data (automatically sorted by key)
        System.out.println("Employee Details (Sorted by Employee ID):");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}


 // Employee model class
 
class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id +
               ", Name=" + name +
               ", Department=" + department +
               ", Salary=" + salary + "]";
    }
}