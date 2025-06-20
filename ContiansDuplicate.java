import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a set to store unique elements
        Set<Integer> visited = new HashSet<>();

        // Traverse array
        for (int i = 0; i < nums.length; i++) {
            // If element already in set → duplicate found
            if (visited.contains(nums[i])) {
                return true;
            }
            // Else, add the element to the set
            visited.add(nums[i]);
        }

        // No duplicates found
        return false;
    }
}
