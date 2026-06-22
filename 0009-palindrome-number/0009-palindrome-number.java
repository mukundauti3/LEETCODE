class Solution {
    public boolean isPalindrome(int x) {
        
            if(x<0)
            {
                return false;
            }
            if(x==0)
            {
                return true;
            }
            String z=Integer.toString(x);
            int left=0;
            int right=z.length()-1;

            while(left<z.length()/2)
            {
                if(z.charAt(left)!=z.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
}