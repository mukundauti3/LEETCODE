class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];

        int i=0;
        int j=numbers.length-1;
        boolean sum=false;

        while(i<j && sum==false)
        {
            int s=numbers[i]+numbers[j];
            if(s==target)
            {
                sum=true;
                ans[0]=i+1;
                ans[1]=j+1;
            }else if(s>target)
            {
                j--;
            }else{
                i++;
            }
        }

        return ans;
    }
}