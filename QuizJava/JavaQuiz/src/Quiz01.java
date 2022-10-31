public class Quiz01 {
    public static void main(String[] args) {
        // String Object - "substring"

        String data = "I love coding Java Language";
        // The developer wants to get word "Java"

        System.out.println("data.substring(15,18) = "+ data.substring(15,18));
        System.out.println("data.substring(14,18) = "+ data.substring(14,18));
        System.out.println("data.substring(14,17) = "+ data.substring(14,17));
        System.out.println("data.substring(15,17) = "+ data.substring(15,17));

        for (int x = 0; x < data.length(); x++) {
            System.out.printf("%3s", data.charAt(x));
        }
        System.out.println();
        for (int x = 0; x < data.length(); x++) {
            System.out.printf("%3d", x);
        }
        System.out.println();

    }
}
