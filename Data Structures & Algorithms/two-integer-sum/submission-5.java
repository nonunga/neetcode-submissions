class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> inventory = new HashMap<>();

        // load map with nums options as key
        for (int i = 0; i < nums.length; i++) {
            inventory.put(nums[i], i);
        }

        // iterate and check if diff is in map as key.
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (inventory.containsKey(diff) && i != inventory.get(diff)) {
                return new int[] {i, inventory.get(diff)};
            }
        }

        return new int[] {};
    }
}
