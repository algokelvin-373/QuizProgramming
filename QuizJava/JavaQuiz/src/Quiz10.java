import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        // Array Double Dimension - Table a + b

        Scanner input = new Scanner(System.in);
        System.out.println("Input a and b: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int[][] data = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                data[x][y] = (x+1) + (y+1);
            }
        }
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.printf("%2d", data[x][y]);
            }
            System.out.println();
        }

    }
}
