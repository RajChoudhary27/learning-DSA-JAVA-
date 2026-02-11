//n2
//optimize nlogn through Arrays.sort
//n
import java.util.*;
public class Ques7 {
static Boolean Anagram(String str1,String str2)
{
     int[] freq=new int[256];

        if(str1.length()!=str2.length())
        {
            return false;
        }
        

        for(int i=0;i<str1.length();i++)
        {
             freq[str1.charAt(i)]++;
             freq[str2.charAt(i)]--;
        }

        for(int x:freq)
        {
            if(x!=0)
            {
                return false;
            }
        }
        return true;
        
    }
    static boolean Anagram1(String str1,String str2)
    {
       char[] string1=str1.toCharArray();
       char[] string2=str2.toCharArray();

       Arrays.sort(string1);
       Arrays.sort(string2);

       return Arrays.equals(string1,string2);
    }

    public static void main(String[] args) {
        String str1="dog";
        String str2="god";
        
      boolean res= Anagram(str1,str2);
      boolean res1=Anagram1(str1,str2);

      if(res)
        System.out.println("Anagram");
     else
        System.out.println("Not an Anagram");

      if(res1)
        System.out.println("Anagram");
     else
        System.out.println("Not an Anagram");

}
}
