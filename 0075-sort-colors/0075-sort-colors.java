class Solution {
    public void sortColors(int[] nums) {

      int  count1=0,count2=0,count3=0;

      for(int num : nums)
      {
        if(num==0)
        {
            count1++;
        }
        else if(num==1)
        {
            count2++;
        }else if(num==2)
        {
            count3++;
        }
      }   

      for(int i = 0;i<count1;i++)
      {
        nums[i]=0;
      } 

       for(int i = count1;i<count1+count2;i++)
      {
        nums[i]=1;
      } 

       for(int i = count1+count2;i<count1+count2+count3;i++)
      {
        nums[i]=2;
      } 

    }
}