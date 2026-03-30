public class MoveNegative {

    static int[] sort(int[] arr) {

        int n = arr.length;
        int[] neg = new int[n];
        int[] pos = new int[n];

        int left = 0, right = 0;

        // Step 1: separate
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[left++] = arr[i];
            } else {
                pos[right++] = arr[i];
            }
        }

        // Step 2: merge back
        int i = 0;

        for (int j = 0; j < left; j++) {
            arr[i++] = neg[j];
        }

        for (int j = 0; j < right; j++) {
            arr[i++] = pos[j];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}