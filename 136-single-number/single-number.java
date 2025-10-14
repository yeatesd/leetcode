class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int check = 0;
        int save = 0;
        int c1 = 0;
        int c2 = 0;
        for(int y = 0;y<nums.length;y++)
        {
            c1 = nums[y];
            for(int x = 0;x<nums.length;x++)
            {
                c2 = nums[x];
                if(c1 == c2 && x !=y)
                {
                    check++;
                }
            }
            if(check == 0)
            {
                save = c1;
            }
            check = 0;
        }
        return (save);
    }
}