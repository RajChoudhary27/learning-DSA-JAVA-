// Ques 3->given an array we have to find the frequency of an given element. in O(nlogn)
// ALGORITHM -> first find first occurence of an element than last occurence then apply formula.
public class Ques3 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,5,6,7,8};
        int low=0;
        int high=arr.length-1;
        int target=3;
        int index=-1;
        int i=-1;
//first occurence
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==target)
            {
               high=mid-1;     
               index=mid;      //left mai jao
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                 low=mid+1;
            }
        }
// RESET POINTERS 
        low = 0;
        high = arr.length - 1;

//Last occurence
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==target)
            {
               low=mid+1; 
               i=mid;      //Right mai jao
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                 low=mid+1;
            }
        }

    int frequency=(i-index)+1;
       System.out.println("Frequency of an element is :- "+frequency);
       
       
        
    }
}
