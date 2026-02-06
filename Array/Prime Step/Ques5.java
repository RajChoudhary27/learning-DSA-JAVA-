// Ques 5-> WAP to arrange given array containing only 0's and 1's in such a way that all the 0's comes before all 1's.

public class Ques5 {
   public static void main(String[] args) {
       int[] arr={0,1,1,0,1,0,1};

       int i=0;
       for(int j=0;j<arr.length-1;j++)
       {
            if(arr[j]==0)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
            }
          
       }
   
     for(int k=0;k<arr.length;k++)
   {
    System.out.print(arr[k]+" ");
   }
}
}
