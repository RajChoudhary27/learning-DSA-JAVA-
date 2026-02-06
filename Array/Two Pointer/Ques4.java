/*
4️⃣ Squares of a Sorted Array
LeetCode #977

📌 Problem Statement
Given a sorted integer array nums (may contain negative numbers),
Return an array of the squares of each number sorted in non-decreasing order.
*/
public class Ques4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
            {
                arr[i]=arr[i]*arr[i];
            }
        for(int x: arr)
        {
            System.out.print(x+" ");
        }
    }
}
