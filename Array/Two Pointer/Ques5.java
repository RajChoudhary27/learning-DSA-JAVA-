/* 
📌 Problem Statement
You are given an integer array height.
Each element represents height of a vertical line.
Find two lines that together form a container that holds the maximum water.
Return the maximum area.
You may not tilt the container.
*/
public class Ques5 {
    public static void main(String[] args) {
        int nums[]={1,8,6,2,5,4,8,3,7};
        int max=0;   
        int left=0;
        int right=nums.length-1;

        while(left<right)
            {
                int width=left-right;
                int height=Math.min(nums[left],nums[right]);
                int area=width*height;
                max=Math.min(max,area);
                
                // Move the smaller height pointer
            if(nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
       
System.out.println("Max area is : " + max);
    }
}
