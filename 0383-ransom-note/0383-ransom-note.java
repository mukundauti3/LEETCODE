class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] ch=new char[ransomNote.length()];
        char[] ch2=new char[magazine.length()];

        for(int i=0;i<ransomNote.length();i++)
        {
            ch[i]=ransomNote.charAt(i);
        }
        

        
        for(int i=0;i<magazine.length();i++)
        {
            ch2[i]=magazine.charAt(i);
        }


        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch2.length;j++)
            {
                if(ch[i]==ch2[j])
                {
                    count++;
                    ch2[j]=' ';
                    break;
                }
            }
        }

        if(count==ransomNote.length())
        {
            return true;
        }

        return false;

    }
}