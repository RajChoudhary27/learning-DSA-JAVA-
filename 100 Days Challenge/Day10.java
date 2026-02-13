/* Ques-10 ->Maximum Product of Two Elements in an Array.
   Given an array of integers nums,find the maximum product of two elements in the array.Return the maximum product after multiplying the two elements together and subtracting 1 from the result.   
*/
/*
Algorithm ->
ek to sorting se kar sakte hai ya phir brute force se bhi kar sakte hai.
Brute force me do loop chalayenge aur har element ke sath baaki elements ka product nikal ke maximum product nikal lenge.
Sorting me array ko sort kar denge aur last ke do elements ka product nikal lenge.
ys first max then second max then multiply them and return the product.
*/
public class Day10 {
    static void divide(int[] arr,int start,int end)
    {
        if (start >= end) {
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    static void merge(int[] arr,int start,int mid,int end)
    {
        int[] newarr=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end)
        {
            if(arr[idx1]<=arr[idx2])
            {
                newarr[x]=arr[idx1++];
            }
            else
            {
                newarr[x]=arr[idx2++];
            }
            x++;
        }
        while(idx1<=mid)
        {
            newarr[x++]=arr[idx1++];
        }
        while(idx2<=end)
        {
            newarr[x++]=arr[idx2++];
        }
        for(int i=0;i<newarr.length;i++)
        {
            arr[start+i]=newarr[i];
        }

    }
   public static void main(String[] args) {
    int[] arr={2,4,5,2,5,3,1};
    int start=0;
    int end=arr.length-1;
    divide(arr,start,end);
    int n = arr.length;
int maxproduct = (arr[n-1]-1)*(arr[n-2]-1);
System.out.print("Maximum product of two elements in the array is: "+maxproduct);
   } 
}
