import java.util.Scanner;

public class p1 {

    // Part (a): Quadratic Equation
    static void quadraticRoots(Scanner sc) {
        System.out.println("\n--- Quadratic Equation ---");
        System.out.print("Enter a, b, c: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d >= 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are: " + r1 + " and " + r2);
        } else {
            System.out.println("Roots are imaginary");
        }
    }

    // Part (b): Array Multiplication
    static void arrayMultiplication(Scanner sc) {
        System.out.println("\n--- Array Multiplication ---");
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            c[i] = a[i] * b[i];

        System.out.println("Resultant array:");
        for (int i = 0; i < n; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }

    // Part (c): Bubble Sort
    static void bubbleSort(Scanner sc) {
        System.out.println("\n--- Bubble Sort ---");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending order:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nDescending order:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        quadraticRoots(sc);
        arrayMultiplication(sc);
        bubbleSort(sc);

        sc.close();
    }
}
 
    

