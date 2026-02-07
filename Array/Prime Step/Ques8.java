/*
Ques 8->Single Number Problem
*/
 //?Points to be remember
/*
  same number ka exor 0 aa jata hai.
          and
  0 exor something is Something.
*/
public class Ques8 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
           result=result^arr[i];
        }
        System.out.println(result);
    }
}
