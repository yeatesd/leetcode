class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int y = 0;
        int temp = 0;
        for(int x = m;x<nums1.length;x++)
        {
            nums1[x] = nums2[y];
            y++;
        }
        for(int i = 0;i<nums1.length;i++)
        {
            for(int j = 0;j<nums1.length-1;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    temp = nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                }
            }
        }
    }
}