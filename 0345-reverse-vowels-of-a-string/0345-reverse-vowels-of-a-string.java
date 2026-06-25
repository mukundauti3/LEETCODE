class Solution {
    public String reverseVowels(String s) {
        char[] return_value=s.toCharArray();

        int left=0;
        int right=return_value.length-1;
        char leftChar='\0';
        char rightChar='\0';

        while(left<=right)
        {
            char c=return_value[left];
            char c2=return_value[right];

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E'|| c=='I' || c=='O'|| c=='U')
            {
                leftChar=c;
            }else{
                left++;
            }

             if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u' || c2=='A' || c2=='E'|| c2=='I' || c2=='O'|| c2=='U')
            {
                rightChar=c;
            }else{
                right--;
            }

            if(leftChar!='\0' && rightChar!='\0')
            {
                char temp=return_value[left];
                return_value[left]=return_value[right];
                return_value[right]=temp;

                left++;
                right--;
                leftChar='\0';
                rightChar='\0';

            }
        }
        return new String(return_value);
    }
}