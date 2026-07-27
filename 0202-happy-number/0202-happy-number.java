class Solution {
     private  int findSquare(int n)
        {
            int sum = 0;
            while(n>0)
            {
               int rem=n%10;
               sum = sum+(rem*rem);
                n = n/10;
            }
             return sum; 
        }
      
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

      do
      {
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast)); 
      } while (slow!=fast);

      return slow==1;

    }
}