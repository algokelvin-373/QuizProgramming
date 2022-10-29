import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        // Array, Looping, Conditional
        Scanner input = new Scanner(System.in);

        int[] number = new int[6];
        int a = input.nextInt();
        int b = input.nextInt();

        number[0] = a;
        for (int i = 1; i < number.length; i++) {
            if (i % 2 == 0) {
                number[i] = a += b;
            } else {
                number[i] = a *= b;
            }
        }

        // a = 2, b = 3 --> 2, 6, 9, 27, 30, 90
        // a = 4, b = 2 --> 4, 8, 10, 20, 22, 44

        for (int j : number) {
            System.out.print(j + ", ");
        }
        System.out.println();

    }
}
