class Solution {
    public boolean isPalindrome(String s) {
        // // String s2 = s.toLowerCase();
        // // String s3 = "";
        // // for (int i = 0; i < s2.length(); i++) {
        // //     if (Character.isLetterOrDigit(s2.charAt(i))) {
        // //         s3 = s3 + s2.charAt(i);
        // //     }
        // // }
        // // s2 = s3;

        // // int j = 0;
        // // for (int i = s3.length() - 1; i >= 0; i--) {
        // //     if (s3.charAt(i) != s2.charAt(j)) {
        // //         return false;
        // //     }
        // //     j++;
        // // }

        // // return true;


        // if(s.length()==1)
        // {
        //     return true;
        // }else{
        //     String z = s.replaceAll("[^a-zA-Z0-9]",""); 
        //     int right=0;
        //     int left=z.length()-1;

        //     while(right<left)
        //     {
                
        //         char a=z.charAt(right);
                
        //         char b=z.charAt(left);

        //         if(Character.toLowerCase(a) == Character.toLowerCase(b))
        //         {
        //             right++;
        //             left--;
        //         }else{
        //             return false;
        //         }
                
        //     }
        // }
        // return true;



        int i=0;
        int j=s.length()-1;

        String s1=s.toLowerCase();

        while(i<j)
        {
            if(!Character.isLetterOrDigit(s1.charAt(i)))
            {
                i++;
            }else if(!Character.isLetterOrDigit(s1.charAt(j)))
            {
                j--;
            }else if(s1.charAt(i)!=s1.charAt(j))
            {
                return false;
                
            }
            else{
            i++;
            j--;
            }
        }

        return true;
    }
}