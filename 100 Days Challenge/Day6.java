/*
Ques-6 ->Reverse words in String.
*/
public class Day6 {
    public static void main(String[] args) {
        String str="hello world";
        String[] arr=str.split(" ");
      
        
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
