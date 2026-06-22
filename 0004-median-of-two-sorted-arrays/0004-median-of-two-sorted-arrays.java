class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {

        int[] merge=new int[nums1.length + nums2.length];

        int j=0;
        int k=0;

        int index=merge.length/2;

        double result=0.0;


          for (int i = 0; i < merge.length; i++) {
            if (j < nums1.length) {
                merge[i] = nums1[j++];
            } else {
                merge[i] = nums2[k++];
            }
        }

        for(int i=0;i<merge.length - 1 ;i++)
        {
            for(int l=i+1;l<merge.length;l++)
            {
                if(merge[i]>merge[l])
                {
                    int temp=merge[i];
                    merge[i]=merge[l];
                    merge[l]=temp;
                }
            }
        }

        if(merge.length%2!=0)
        {
            result=merge[index];
        }else{
            result = (merge[index] + merge[index - 1]) / 2.0;
        }

        return result;
    }
}
