
import java.util.HashMap;
import java.util.Map;

public class fruitsIntoBasket2 {

    public int FindFruitsIntoBasket(int fruits[]) {
        int maxLen = 0;
        int i=0;//left pointer
        //j=right pointer 
       
            Map<Integer, Integer> basket = new HashMap<>();// hashmap to store the : value and its count!

            for (int j = 0; j < fruits.length; j++) {
                basket.put(fruits[j], basket.getOrDefault(fruits[j], 0) + 1);// traversing krte krte basket m fill
                                                                             // krna!!

                while (basket.size() > 2) {
                    // here shrinking of the WINDOW BEGINS :
                    basket.put(fruits[i], basket.get(fruits[i]) - 1);// thjis reduced 1 fruit frm left side

                    if (basket.get(fruits[i]) == 0) {
                        basket.remove(fruits[i]);
                    }
                        i++;// aage badhte chalo rukna nhii hh
                    
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2 };
        fruitsIntoBasket2 result = new fruitsIntoBasket2();
        System.out.println(result.FindFruitsIntoBasket(arr));
    }
}
