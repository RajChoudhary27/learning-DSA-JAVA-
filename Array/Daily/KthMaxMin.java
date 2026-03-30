import java.util.*;
public class KthMaxMin {
    static int max(int[] arr,int k)
    {
        int size=arr.length;
        Arrays.sort(arr);
        return arr[size-k-1];
    }
    static int min(int[] arr,int k)
    {
        int size=arr.length;
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int [] arr={2,5,7,2,6,1,6,9};
        int k=2;
        int max=max(arr,k);
        int min=min(arr,k);
        System.out.println(k+"th Maximum element is "+max);
        System.out.println(k+"th Minimum element is "+min);
    }
}
