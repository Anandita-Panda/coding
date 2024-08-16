class Solution 
{
    public int[] twoSum(int[] nums, int target)
     {
        int i=nums.length;
        int arr[]=new int[2];
        int c=0;
        for(int j=0;j<i;j++)
        {
            for(int k=j+1;k<i;k++)
            {
                if(nums[j]+nums[k]==target)
                {
                    arr[c]=j;
                    c++;
                    arr[c]=k;
                }

            }
        }
        return arr;
    }
}