class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
           Map<Integer,Integer> map1=new HashMap<>();

           for(int i=0;i<nums.length;i++)
           {
            int contains=target-nums[i];

            if(map1.containsKey(contains))
            {
                return new int[]{map1.get(contains),i};
            }

            map1.put(nums[i],i);
           }
           return new int[]{};
    }
}