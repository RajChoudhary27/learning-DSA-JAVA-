// Dutch National Flag Algorithm
//Time Complexity: O(n)
//Space Complexity: O(1)
public class Move0_1_2 {
    static void sort(int[] arr)
    {
        int low=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid++]=arr[low];
                arr[low++]=temp;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
    }
    public static void main(String[] args) {
       int[] arr={0,1,2,0,1,2,0,1,2}; 
       sort(arr);
       for(int x: arr)
       {
        System.out.println(x);
       }
    }
}
