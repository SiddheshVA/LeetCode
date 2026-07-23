// class Solution {
//     public int findPeakElement(int[] nums) {

//         int n = nums.length;

//         if(n == 1)
//             return 0;

//         for(int i = 0; i < n; i++) {

//             boolean left = (i == 0) || nums[i] > nums[i - 1];
//             boolean right = (i == n - 1) || nums[i] > nums[i + 1];

//             if(left && right)
//                 return i;
//         }

//         return -1;
//     }
// }
class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left<right)
        {

            int mid = left + (right-left)/2;

            if(nums[mid]>nums[mid+1])
            {
                right=mid;
            }else
            {
                left=mid+1;
            }
        }
          return left;
    }
}