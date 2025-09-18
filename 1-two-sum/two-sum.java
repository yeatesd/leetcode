class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int c1 = 0;
        int c2 = 0;
        int sum = 0;
        int s1 = 0;
        int s2 = 0;
        for(int x = 0;x < len; x++)
        {
            c1 = nums[x];
            for(int y = 0;y < len;y++)
            {
                if(x != y)
                {
                    c2 = nums[y];
                    sum = c1+c2;
                    if(sum == target)
                    {
                        s1 = x;
                        s2 = y;
                        return new int[] {s1,s2};
                    }
                }
                
            }
        }
        return new int[] {s1,s2};
    }
}