class Solution {
    public int strStr(String haystack, String needle) {
        int n = 0;
        int save = 0;
        int x = 0;
        int check = 0;
        int temp = 0;
        while(check<needle.length() && x != haystack.length())
        {
            if(haystack.charAt(x) == needle.charAt(n) && check == 0)
            {
                temp = x;
                check++;
                n++;
            }
            else if(haystack.charAt(x) == needle.charAt(n))
            {
                n++;
                check++;
            }
            else
            {
                if(check>0)
                {
                    x = temp;
                }
                check = 0;
                n = 0;
                temp = 0;
            }
            x++;
        }
        if(check == needle.length())
        {
            return temp;
        }
        else
        {
            return -1;
        }
    }
}