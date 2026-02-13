// Ques-7 -> Kth largest Elements in an array.Given an integer Array nums and a number k,find the kth largest element in an array.
//use Merge Sort to sort the array and then return the kth largest element.

public class Day7 {

    static void divide(int arr[], int start, int end) {
        int mid = start + (end - start) / 2;
        if (start >= end) {
            return;
        }
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        merge(arr, start, mid, end);

    }

    static void merge(int arr[], int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                idx1++;
            } else {
                merge[x] = arr[idx2];
                idx2++;
            }
            x++;
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0; i < merge.length; i++) {
            arr[start + i] = merge[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3, 7, 7};
        int start = 0;
        int end = arr.length-1;
        divide(arr, start, end);
        for(int x:arr){
            System.out.print(x+" ");
        }
        int k = 3;
        System.out.println("\n"+k+"th largest element is: "+arr[arr.length-k]);

    }
}
