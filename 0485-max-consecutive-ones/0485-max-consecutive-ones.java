class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int Maxcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                Maxcount= Math.max(Maxcount, count);
            }
            else
            {
                count=0;
            }
        }
        return Maxcount;
    }
}