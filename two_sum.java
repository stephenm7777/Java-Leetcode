class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> answer = new HashMap<>(); // hashmap 
        int n = nums.length; //length of nums 
        for (int i = 0; i < n; i++) { // going through nums 
            int complement = target - nums[i]; //subtracting the target value from the value inside nums 
            if (answer.containsKey(complement)) {  // if the complement is inside of the hashmap, return the index
                return new int[]{answer.get(complement), i}; 
            }
            answer.put(nums[i], i); // add the value and the index to that hashmap 
        }
        return new int[]{}; // if the answer is not there then return nothing 
    }
}
