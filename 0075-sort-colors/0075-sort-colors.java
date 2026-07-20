// class Solution {
//     public void sortColors(int[] nums) {

//       int  count1=0,count2=0,count3=0;

//       for(int num : nums)
//       {
//         if(num==0)
//         {
//             count1++;
//         }
//         else if(num==1)
//         {
//             count2++;
//         }else if(num==2)
//         {
//             count3++;
//         }
//       }   

//       for(int i = 0;i<count1;i++)
//       {
//         nums[i]=0;
//       } 

//        for(int i = count1;i<count1+count2;i++)
//       {
//         nums[i]=1;
//       } 

//        for(int i = count1+count2;i<count1+count2+count3;i++)
//       {
//         nums[i]=2;
//       } 

//     }
// }

class Solution {
    public void sortColors(int[] nums) {


   int low = 0;
   int mid = 0;
   int high = nums.length-1;


   while(mid<=high)
   {
    if(nums[mid]==0)
    {
        swapped(nums,low,mid);
        low++;
        mid++;
    }
    else if(nums[mid]==1)
   {
    mid++;
   }else
   {
    swapped(nums,mid,high);
   high--;
   }
   }
    
    }
    private void swapped(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

   }
}