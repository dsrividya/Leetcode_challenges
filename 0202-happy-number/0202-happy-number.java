class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sum(n);
        }




        return n==1;
    }


public static int sum(int n)
{
    int result=0;
    while(n>0)
    {
       int temp=n%10;
       result+=temp*temp;
       n=n/10;
    }
    return result;
}

}