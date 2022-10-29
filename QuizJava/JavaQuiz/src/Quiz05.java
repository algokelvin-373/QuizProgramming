public class Quiz05 {
    public static void main(String[] args) {
        // String Object - charAt

        String data = "AlgoKelvin";
        boolean A = String.valueOf(data.charAt(0)) == "A";
        int B = data.charAt(0);
        int C = data.toLowerCase().charAt(4);
        boolean D = data.charAt(4) == 'k';

        System.out.println("A. "+ A);
        System.out.println("B. "+ B);
        System.out.println("C. "+ C);
        System.out.println("D. "+ D);

    }
}
