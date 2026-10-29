class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indeces = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            indeces.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (indeces.containsKey(diff) && indeces.get(diff) != i){
                return new int[]{i,indeces.get(diff)};
            }
        }
        return new int[0];
    }
}
