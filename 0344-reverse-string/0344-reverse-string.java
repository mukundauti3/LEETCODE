class Solution {
    public void reverseString(char[] s) {
        char [] s2=new char[s.length];

        for(int i=0;i<s.length;i++)
        {
            s2[i]=s[i];
        }
        int j=0;
        for(int i=s2.length-1;i>=0;i--)
        {
            s[j]=s2[i];
            j++;
        }
    }
}