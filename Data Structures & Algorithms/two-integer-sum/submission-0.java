class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // int temp = 0;
        // for (int i = 0 ; i < nums.length ; i++)
        // {
        //     temp = target - nums[i];
        //     for (int j = i + 1 ; j < nums.length ; j++)
        //     {
        //         if (nums[j] == temp)
        //         {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        Map<Integer, Integer> newhm = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            if(newhm.containsKey(target - nums[i]))
            {
                return new int[]{newhm.get(target - nums[i]), i};
            }
            else
            {
                newhm.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}