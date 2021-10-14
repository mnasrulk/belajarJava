import java.util.*;

public class objectPassing {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Grapes"));
        System.out.println("Data before calling method: " + Arrays.toString(fruits.toArray()));
        processData(fruits);
        System.out.println("Data after calling method: " + Arrays.toString(fruits.toArray()));
    }

    private static void processData(List<String> fruitsRef) {
        fruitsRef.add("Durian");
    }
}
