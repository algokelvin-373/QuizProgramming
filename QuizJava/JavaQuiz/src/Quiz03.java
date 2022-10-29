import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        // Conditional in Looping
        Scanner input = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = input.nextInt();
        for (int x = 1; x <= n ; x ++) {
            if (x == 3 || x == 5) {
                System.out.print(x + " ");
            } else {
                continue;
            }
        }
    }
}
