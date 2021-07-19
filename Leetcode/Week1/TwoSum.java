class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < nums.length; i++) 
        {
             // If the map already contains the number, that with the current one adds to the target, that's the solution, and all we need to do is retreive it.
             // This even works with the [3,3] case, because we only ever put one addend into the map.
             
             if (map.containsKey(target - nums[i])) {
                // Return the array index of the number that with the current adds to the target, and the current array index.
                return new int[]{map.get(target - nums[i]), i};
            } else {
                // Otherwise, add the number and its index to the map, because for the answer we need the index.
                map.put(nums[i], i);
            }
        }
        
        // All the test cases (I believe) have a solution, but this can't hurt.
        return new int[]{-1, -1};
    }
}
