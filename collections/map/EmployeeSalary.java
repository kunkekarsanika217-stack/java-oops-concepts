import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

    public static void main(String[] args) {

        // HashMap to store EmployeeID as key and Salary as value
        Map<Integer, Double> employeeSalaryMap = new HashMap<>();

         // Adding employee salaries
        employeeSalaryMap.put(101, 55000.00);
        employeeSalaryMap.put(102, 65000.00);
        employeeSalaryMap.put(103, 75000.00);

        // Fetch salary of a specific employee
        int employeeId = 102;
        System.out.println("Salary of Employee " + employeeId + " : "
                + employeeSalaryMap.get(employeeId));

        // Updating salary of an employee
        employeeSalaryMap.put(103, 80000.00);
        // Checking if an employee exists
        if (employeeSalaryMap.containsKey(101)) {
            System.out.println("Employee 101 exists in the system");
        }

        // Iterating through HashMap
        System.out.println("\nAll Employee Salaries:");
        for (Map.Entry<Integer, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey()
                    + ", Salary: " + entry.getValue());
        }
    }
}

