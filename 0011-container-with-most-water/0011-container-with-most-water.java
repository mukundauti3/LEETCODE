class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxHeight=0;
        
        while(i<j)
        {
            int k=j-i;
           int maxHeight2 = Math.min(height[i], height[j]) * k;


            if(maxHeight<maxHeight2)
            {
                maxHeight=maxHeight2;
            }


            if(height[i]<=height[j])
            {
                i++;
            }else{
                j--;
            }


            

            
        }

        return maxHeight;
    }
}