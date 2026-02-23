import java.util.HashMap;
import java.util.Map;

public class fruitsIntoBasket1 {

    public int FindFruitsIntoBasket(int fruits[]) {
        int maxLen = 0;
        for (int i = 0; i < fruits.length; i++) {
            Map<Integer, Integer> basket = new HashMap<>();// hashmap to store the : value and its count!
            int currentCount = 0;

            for (int j = i; j < fruits.length; j++) {
                basket.put(fruits[j], basket.getOrDefault(fruits[j], 0) + 1);// traversing krte krte basket m fill
                                                                             // krna!!

                if (basket.size() > 2) {
                    break;
                }
                currentCount++;
            }
            maxLen = Math.max(maxLen, currentCount);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2 };
        fruitsIntoBasket1 result = new fruitsIntoBasket1();
        System.out.println(result.FindFruitsIntoBasket(arr));
    }
}
