import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        // Function - Looping - Conditional
        Scanner input = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = input.nextInt();
        set(n);

    }

    // A. y < n+x || B. y <= n-x
    // A. y < n+x || B. y < n-x
    // A. y <= n+x || B. y < n-x
    // A. y <= n+x || B. y <= n-x
    private static void set(int n) {
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y < n + x; y++) {
                if (y <= n - x) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
