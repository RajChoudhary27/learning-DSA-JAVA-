// Ques-3 ->Given an array nums containing n distinct numbers taken from the range 0 to n, return the only number in the range that is missing from the array ?
public class Day3 {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        int len=arr.length;
        int MAX=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<len;i++)
        {
           if(arr[i]>MAX)
           {
              MAX=arr[i];
           }
           sum+=arr[i];
        }
        
       // Expected sum from 0 to n
        int expectedSum = len * (len + 1) / 2;

        System.out.println("Missing element is "+(expectedSum-sum));

    }
    
}
