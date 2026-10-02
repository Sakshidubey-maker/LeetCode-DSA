import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Number we need to find
            int m = target - num;

            // Check if the needed number was already seen
            if (h.containsKey(m)) {
                return new int[] {h.get(m), i};
            }

            // Store: number -> index
            h.put(num, i);
        }

        return new int[] {};
    }
}

// brute force

    // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int sum = nums[i] + nums[j];

        //         if (sum == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        // return new int[]{};