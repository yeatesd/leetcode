class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int save = 0;
        while(i < nums.length)
        {
            if(nums[i] == target)
            {
                return(i);
            }
            else if (nums[i] > target )
            {
                return(i);
            }
            else{
                i++;
            }

        }
        return(i);
    }
}