//  Q.3 WAP to find minimum distance between two given words.
// str = my shool name is xyz. my location is indore
public class Ques9 {
    public static void main(String[] args) {
        String str="my shool name is xyz. my location is indore";

        String[] arr=str.split(" ");
        String word1="my";
        String word2="is";
        int min=Integer.MAX_VALUE;
        int idx1=0;
        int idx2=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(word1))
            {
                idx1=i;
            }

            if(arr[i].equals(word2))
            {
                idx2=i;
            }
          int calc=Math.abs(idx2-idx1)+1;

          if(calc<min) 
            { min=calc; }

        }
        System.out.println(min);
    }
}
