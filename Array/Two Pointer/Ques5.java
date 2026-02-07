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
        int i=0;
       

        for(int j=1;j<nums.length-1;j++)
        {
              max=nums[i]*nums[j];  //9
              if(nums[i]*nums[j]>=max)
              {
                max=nums[i]*nums[j];
                
                i++;
              }
              i++;
        }
        System.out.println("Max area is : "+max);
    }
}
