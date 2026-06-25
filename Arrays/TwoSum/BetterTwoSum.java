package Arrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BetterTwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSumUsingMap(new int[]{1, -7, 3, 5, 8, 2, 7}, 15)));
    }

    private static int[] getSumUsingMap(int[] arr, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(numbers.containsKey(complement) && numbers.get(complement) != i) {
                return new int[]{i, numbers.get(complement)};
            }
        }
        return new int[]{};
    }
}
