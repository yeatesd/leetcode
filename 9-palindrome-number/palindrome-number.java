class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        else
        {
            String check = Integer.toString(x);
            int len = check.length();
            int z = 0;
            int y = len-1;
            while(z < y)
            {
                if(check.charAt(z) != check.charAt(y))
                {
                    return false;
                }
                z++;
                y--;
            }
            return true;
        }
    }
}