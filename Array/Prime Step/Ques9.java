/*
Ques 9->Plus one Problem
[1,2,4] -> [1,2,5] 
*/ 
public class Ques9 {
    public static void main(String[] args) {
        int[] arr={9,9,9};
        
        int carry=1;
        for(int i=arr.length-1;i>=0;i--)
        {
                int temp=arr[i]+carry;
                arr[i]=temp%10;
                carry=temp/10;
                
                if(carry == 0) break;
        }
        if(carry==1)
        {
           int[] arrnew=new int[arr.length+1];
              arrnew[0]=1;
              
                for(int i=0;i<arr.length;i++)
                {
                    arrnew[i+1]=arr[i];
                }
                arr = arrnew;
        }

        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
