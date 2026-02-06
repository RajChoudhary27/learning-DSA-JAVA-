/* 
📌 Problem Statement
Given a sorted array nums, remove the duplicates in-place such that each unique element appears only once.
Return the number of unique elements k.
The first k elements should contain the final result.
Do not allocate extra array.
*/
public class Ques2 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5};
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
           if(arr[i]!=arr[j])
           {
               i++;
              arr[i]=arr[j];
           }
        }
        for(int k=0;k<=i;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
