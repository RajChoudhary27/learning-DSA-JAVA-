/*           ( TWO SUM )
📌 Problem Statement
You are given a 1-indexed array of integers numbers that is sorted in non-decreasing order.
Find two numbers such that they add up to a specific target.
Return the indices of the two numbers (1-indexed).
You must use constant extra space.
There is exactly one solution.
Time Complexity- O(nlogn)
*/
public class Ques1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,6,8,9};
        int target=15;
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
           int sum=nums[left]+nums[right];

           if(sum==target)
           {
            System.out.print("Pair fount at index "+nums[left]+" and "+nums[right] );
            return;
           }
           else if (sum<target)
           {
              left++;
           }
           else{
            right--;
           }
        }
    }    
}
