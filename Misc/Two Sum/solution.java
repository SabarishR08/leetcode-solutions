import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store value → index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store current number with its index
            map.put(nums[i], i);
        }
        
        // Problem guarantees one solution, so no need for extra return
        return new int[] {};
    }
}
