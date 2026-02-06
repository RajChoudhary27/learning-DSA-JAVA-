/*
📌 Problem Statement
Given an integer array nums, move all 0s to the end while maintaining the relative order of non-zero elements.
Do this in-place.
*/
// public class Ques3 {
//     public static void main(String[] args) {
//         int[] arr={1,0,3,0,4,0};

//         int start =0;
//         int end=arr.length-1;
//         while(start<=end)
//         {
//             if(arr[start]==0)
//             {
//                 int temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
                
//                 end--;
//             }
//             else
//             {
//                 start++;
//             }
//         }
//         for(int j=0;j<arr.length;j++)
//         {
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// or
// Effiecient way

public class Ques3 {
    public static void main(String[] args) {

        int[] arr = {1,0,3,0,4,0};

        int i = 0;

        // Move non-zero elements forward
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }

        // Fill remaining with 0
        while(i < arr.length) {
            arr[i++] = 0;
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
