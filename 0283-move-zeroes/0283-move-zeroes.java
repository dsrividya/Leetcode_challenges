class Solution {
    public void moveZeroes(int[] nums) {
    
        LinkedList<Integer> ar= new LinkedList<Integer>();
            for(int num:nums)
            {
                if(num!=0)
                {
                    ar.add(num);
                }
            }
            while (ar.size() < nums.length) {
            ar.add(0);
        }

            for(int i=0;i<nums.length;i++)
            {

             nums[i] = ar.get(i);
            }
    
           for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}