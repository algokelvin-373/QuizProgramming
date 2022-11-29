public class Quiz20 {
    public static void main(String[] args) {
        elevenNumber(4);
        elevenNumber(5);
    }
    private static void elevenNumber(int n) {
        int number = Integer.parseInt("1".repeat(n));
        System.out.println(number * number);
    }
}
