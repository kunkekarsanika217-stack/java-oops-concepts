public class Array {

    public static void main(String[] args) {

        // 1D Array
        int[] arr1D = {10, 20, 30, 40};

        System.out.println("1D Array Length: " + arr1D.length);
        System.out.print("1D Array Elements: ");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }

        System.out.println("\n");

        // 2D Array
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2D Array Rows: " + arr2D.length);

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println("Row " + i + " Length: " + arr2D[i].length);
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}