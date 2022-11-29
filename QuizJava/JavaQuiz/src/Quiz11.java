import java.util.ArrayList;
import java.util.Arrays;

public class Quiz11 {
    public static void main(String[] args) {
        // Generic Programming - Case: Array List

        ArrayList<String> stringArrayList = new ArrayList<String>(
                Arrays.asList("Java", "Kotlin", "Python")
        );
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(
                Arrays.asList(100, 200, 300)
        );
        ArrayList<Object> anyArrayList = new ArrayList<Object>(
                Arrays.asList("Java", 200, 'k', null)
        );

        System.out.println("stringArrayList : "+ stringArrayList);
        System.out.println("integerArrayList: "+ intArrayList);
        System.out.println("anyArrayList    : "+ anyArrayList);

    }
}
