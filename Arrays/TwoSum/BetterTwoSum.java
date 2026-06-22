package Arrays.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class BetterTwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> nos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            nos.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (nos.containsKey(complement) && nos.get(complement) != i) {
                return new int[]{i, nos.get(complement)};
            }
        }

        return new int[]{};
    }
}
