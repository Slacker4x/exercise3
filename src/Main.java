import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(15) + 1;
        }

        for (int value : array) {
            System.out.print(value + " ");
        } System.out.println();

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int value : array) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
            }
        }
    }
}