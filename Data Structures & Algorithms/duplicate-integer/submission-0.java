class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        Map<Integer, Integer> checkduplicate = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (checkduplicate.containsKey(nums[i])) // why saving values as key because searching of keys in hashmap take O(1) times while the value saerch take O(N) times. so conatinsKey() method return true if value as a key is already present in the hashmap.
            {
                return true;
            }
            else
            {
                checkduplicate.put(nums[i] , i);
            }
        }  
        return false;  
    }
}