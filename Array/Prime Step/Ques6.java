//WAP to merge two sorted arrays.

public class Ques6 {

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 11, 19, 20};
        int[] arr2 = {3, 4,4, 9, 12};
        int length = arr1.length + arr2.length;
        int[] newarr = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                k++;
                i++;
            } else {
                newarr[k] = arr2[j];
                k++;
                j++;
            }
        }
        // remaining elements of arr1
        while (i < arr1.length) {
            newarr[k++] = arr1[i++];
        }

        // remaining elements of arr2
        while (j < arr2.length) {
            newarr[k++] = arr2[j++];
        }

        for (int x : newarr) {
            System.out.print(x + " ");
        }
    }
}
