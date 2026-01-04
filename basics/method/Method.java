public class Method {

    public static void main(String[] args) {
        Method demo = new Method();

        int sumTwo = demo.add(10, 20);        // method call
        int sumThree = demo.add(10, 20, 30);  // overloaded method call
        String message = demo.getGreeting("Sanika");

        System.out.println(sumTwo);
        System.out.println(sumThree);
        System.out.println(message);
    }

    // method with parameters and return type
    public int add(int a, int b) {
        return a + b;
    }

    // method overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with parameter and return type
    public String getGreeting(String name) {
        return "Welcome, " + name;
    }
}