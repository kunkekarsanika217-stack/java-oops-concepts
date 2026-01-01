public class Strings {

    public static void main(String[] args) {

        // String creation
        String s1 = "Java";                 // String literal (SCP)
        String s2 = new String("Java");     // Heap object
        String s3 = "Java";                 // Reuses SCP object

        // Reference vs content comparison
        System.out.println(s1 == s3);       // true (same SCP reference)
        System.out.println(s1 == s2);       // false (different memory)
        System.out.println(s1.equals(s2));  // true (same content)

        // String immutability
        String name = "Sanika";
        name.concat(" K");                  // creates new object, name unchanged
        System.out.println(name);           // Sanika

        name = name.concat(" K");           // reassignment required
        System.out.println(name);           // Sanika K

        // Common String methods
        String str = "  Java Programming  ";
        System.out.println(str.length());          // total length
        System.out.println(str.trim());            // removes spaces
        System.out.println(str.toUpperCase());     // uppercase
        System.out.println(str.toLowerCase());     // lowercase
        System.out.println(str.substring(2, 6));   // substring
        System.out.println(str.contains("Java"));  // content check
        System.out.println(str.replace("Java", "Core Java"));
        System.out.println(str.startsWith("  Ja"));

        // String concatenation (immutable)
        String text = "Hello";
        text = text + " World";
        text = text + " Java";
        System.out.println(text);

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append(" Java");
        System.out.println(sb);

        
    }
}