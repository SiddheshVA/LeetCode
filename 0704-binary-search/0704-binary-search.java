// class Solution {
//     public int search(int[] nums, int target) {

//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {

            int n = nums.length;
           return findNumber(nums,target,0,n-1);      
    }
    private int findNumber(int[] nums,int target,int s,int e)
    {
       if(s>e)
       {
        return -1;
       }
       int mid = s + (e-s)/2;

       if(nums[mid]==target)
       {
        return mid;
       }
       if(nums[mid]>target)
       {
        return findNumber(nums,target,s,mid-1);
       }
       if(nums[mid]<target)
       {
        return findNumber(nums,target,mid+1,e);
       }
     return mid;
    }     
}