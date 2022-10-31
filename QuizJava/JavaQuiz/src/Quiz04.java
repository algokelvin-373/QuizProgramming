import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        // Array Data and Operator
        Scanner input = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = input.nextInt();
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input r: ");
        int r = input.nextInt();

        int[ ] geometry = new int[n];
        for (int i = 0; i < geometry.length; i++) {
            geometry[i] = (a *= r)/r;
        }
        for (int j : geometry) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
