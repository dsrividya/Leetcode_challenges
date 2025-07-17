class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int c= target-nums[i];
            if(al.contains(c))
            {
                return new int[]{al.indexOf(c),i};
            }
            al.add(nums[i]);
           
        }
       return new int[]{-1,-1};  
}
}
