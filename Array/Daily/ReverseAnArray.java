package Array.Daily;

//!           (Reverse An Array)
public class ReverseAnArray {
    //Two Pointer Approach
    static void reverseByTwoPointer(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
       
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        } 
    }
    //Single Pointer Approach
    static void reverseBySinglePointer(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //Two Pointer Approach
        reverseByTwoPointer(arr);
        for(int x :arr)
        {
            System.out.println(x);
        }
        //Single Pointer Approach
        reverseBySinglePointer(arr);
        for(int x :arr)
        {
            System.out.println(x);
        }

    }
}
