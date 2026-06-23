class Solution {
    public int strStr(String h, String n) {
        int index=h.indexOf(n);
        if(index!=-1)
        {
            return index;
        }
        return -1;
    }
}