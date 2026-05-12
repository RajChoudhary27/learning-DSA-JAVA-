
public class KadaneAlgo {

    static int subArraySum(int[] arr) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int x = 0; x < arr.length; x++) {
            currentsum += arr[x];
            maxsum = Math.max(currentsum, maxsum);

            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int max = subArraySum(arr);
        System.out.println(max);
    }
}

/*
You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.
 */
