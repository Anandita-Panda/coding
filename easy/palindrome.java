class Solution 
{
    public boolean isPalindrome(int x)
     {
        int r=0;
        int num=x;
        int rev=0;
        while(x!=0)
        {
            r=x%10;
            rev=rev*10+r;
            x=x/10;

        }
        if(rev==num && num>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}