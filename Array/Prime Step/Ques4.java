// WAP to remove duplicate elements from a sorted array of integers.
// Constraints: Time complexity should be O(n) and space complexity should be O(1)
public class Ques4 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,6,7,8};
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
             if(arr[i]!=arr[j])
             {
                 j++;
                arr[j]=arr[i];
             }
        }
        for(int k=0;k<j;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
