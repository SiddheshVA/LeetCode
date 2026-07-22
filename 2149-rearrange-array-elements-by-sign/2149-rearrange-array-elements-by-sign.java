class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] nums1 = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for(int k : nums)
        {
            if(k>0)
            {
                nums1[pos]=k;
                pos+=2;
                
            }else
            {
                nums1[neg]=k;
                neg+=2;
                
            }
        }
        return nums1;
    }
}