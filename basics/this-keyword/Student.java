class Student {

    int id;
    String name;

    // Constructor using 'this' to refer instance variables
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method using 'this' to call another method
    void display() {
        this.printDetails();
    }

    void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Sanika");
        s1.display();
    }
}