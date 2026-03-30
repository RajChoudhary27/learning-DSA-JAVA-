
public class MaxMinInArray {

    static void maxmin(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            };
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum :- " + max);
        System.out.println("Minimum :- " + min);

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 3, 6};
        maxmin(arr);
    }
}
