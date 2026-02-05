/*
Ques 2 ->You are given a sorted integer array nums (sorted in ascending order) and an integer target.
Your task is to:
Return the index if the target is found.
If not found, return the index where it should be inserted so that the array remains sorted.
*/
public class Ques2 {
   
        static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;  // found
            } 
            else if (nums[mid] < target) {
                low = mid + 1;   // move right
            } 
            else {
                high = mid - 1;  // move left
            }
        }

        return low; // insert position
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        int index = searchInsert(nums, target);
        System.out.println("Insert Position: " + index);
    }
}
    


