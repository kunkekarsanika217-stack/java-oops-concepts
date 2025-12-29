public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators perform mathematical calculations
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Unary operators work on a single operand
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(-x);

        // Assignment operators assign and update values
        int total = 20;
        total += 10;
        total -= 5;
        total *= 2;
        total /= 5;
        total %= 3;
        System.out.println(total);

        // Relational operators compare values and return boolean
        int m = 25, n = 18;
        System.out.println(m == n);
        System.out.println(m != n);
        System.out.println(m > n);
        System.out.println(m < n);
        System.out.println(m >= n);
        System.out.println(m <= n);

        // Logical operators combine multiple conditions
        boolean isAdult = true, hasID = false;
        System.out.println(isAdult && hasID);
        System.out.println(isAdult || hasID);
        System.out.println(!isAdult);

        // Bitwise operators work on binary values
        int p = 5, q = 3;
        System.out.println(p & q);
        System.out.println(p | q);
        System.out.println(p ^ q);
        System.out.println(~p);

        // Shift operators shift bits left or right
        int num = 8;
        System.out.println(num << 1);
        System.out.println(num >> 1);
        System.out.println(num >>> 1);

        // Ternary operator is a short form of if-else
        int age = 20;
        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(result);

        // instanceof operator checks object type at runtime
        String language = "Java";
        System.out.println(language instanceof String);

        // Type casting converts one data type into another
        double salary = 45000.75;
        int roundedSalary = (int) salary;
        System.out.println(roundedSalary);
    }
}