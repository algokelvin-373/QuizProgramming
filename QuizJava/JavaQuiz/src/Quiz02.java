import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        // Looping Conditional
        Scanner input =  new Scanner(System.in);

        System.out.print("Input a, b, n: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();

        int Un = a + b*n;
        for (int x = a; x != Un ; x += b) {
            System.out.print(x +", ");
        }
    }
}
