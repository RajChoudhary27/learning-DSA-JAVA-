/*
Ques-5 ->You are given a list of non-negative integers nums.
Your task is to arrange them such that they form the largest possible number when concatenated together.
Return the result as a string.
*/ 
import java.util.Arrays;
public class Day5 {
    public static void main(String[] args) {
     
        int[] nums={1,2,0,3,4,5};

        String[] arr=new String[nums.length];

        // Covert array into string
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }

        // sort using lamba expression 
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        //if highest is 0
        if(arr[0].equals("0"))
        {
            System.out.print("0");
            return;
        }

        //join all
        String result="";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        System.out.println(result);


    }
}

