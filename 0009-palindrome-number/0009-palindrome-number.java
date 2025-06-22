class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n=x;
        int digit=0;
        while(x>0)
        {
            int temp=x%10;
            digit=digit*10+temp;
            x=x/10;
        }
       return (n==digit);
    }
}