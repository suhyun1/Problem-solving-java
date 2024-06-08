import java.util.Map;

/**
 * leetcode 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * time complexity: O(n)
 */
class TwoSum {
    public int[] solution(int[] nums, int target) {

        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (maps.containsKey(diff)) {
                return new int[] {i, maps.get(diff)}; 
            } else {
                maps.put(nums[i], i);
            }

        }
        return null;
    }
}