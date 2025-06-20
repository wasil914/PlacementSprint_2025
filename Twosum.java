import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int diff = target - current;

            // Check if the complement (target - current) is already in the map
            if (map.containsKey(diff)) {
                // If found, return the indices
                return new int[]{map.get(diff), i};
            }

            // If not found, store the current number and its index in the map
            map.put(current, i);
        }

        // If no solution found (though problem guarantees one), return null
        return null;
    }
}
