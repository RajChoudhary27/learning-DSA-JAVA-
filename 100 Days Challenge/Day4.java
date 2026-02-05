// Ques-4 ->You are given an integer array nums and an integer value val.
// Your task is to remove all occurrences of val in the array in-place (without using extra array).
//Two pointer Approach
public class Day4 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,2,6,7};
        int val=2;
        int i = 0; 

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != val){
                arr[i] = arr[j];
                i++;
            }
        }
        for(int k=0;k<i;k++){
            System.out.println(arr[k]);
        }
    }
    
}
