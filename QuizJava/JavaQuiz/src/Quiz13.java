import java.util.Scanner;

public class Quiz13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = input.nextInt();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < 2*n; y++) {
                if ((y > 0 && y < 2*n-1) && (x > 0 && x < n-1)) {
                    System.out.print("X");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
