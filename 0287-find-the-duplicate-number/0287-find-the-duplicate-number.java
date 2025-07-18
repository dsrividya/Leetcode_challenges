class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> s= new HashSet<Integer>();
       for(int num:nums)
       {
        if(s.contains(num))
        {
              return num;
        }

        s.add(num);
       }

       return -1;
    }
}