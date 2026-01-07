public class TypeCasting {

    public static void main(String[] args) {

        // Widening Type Casting (Implicit)
        int intValue = 100;
        double doubleValue = intValue;

        // Narrowing Type Casting (Explicit)
        double salary = 45875.75;
        int roundedSalary = (int) salary;

        // Character to Integer casting
        char grade = 'A';
        int asciiValue = grade;

        // Integer to Character casting
        int code = 66;
        char letter = (char) code;

        System.out.println("Widening Casting (int to double): " + doubleValue);
        System.out.println("Narrowing Casting (double to int): " + roundedSalary);
        System.out.println("Char to int (ASCII value): " + asciiValue);
        System.out.println("Int to char: " + letter);
    }
}