/* 
Ques 1 ->WAP to swap elements of given array pairwise
[1,2,3,4,5]
[2,1,4,3,5]
*/
public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

       for(int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
