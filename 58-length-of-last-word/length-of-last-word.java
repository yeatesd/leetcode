class Solution {
    public int lengthOfLastWord(String s) {
        int check = 0;
        int len = s.length()-1;
        while(s.charAt(len) == ' ')
        {
            len--;
        }
        while(len >= 0 && s.charAt(len) != ' ')
        {
            check++;
            len--; 
        }
        return(check);
    }
}
