//WAP to checkwhether an string is palindrome or not.
public class Ques5 {
    static void Palindrome(String str)
    {
          int start=0;
          int end=str.length()-1;
          while(start<end)
          {
            if(str.charAt(start)!=str.charAt(end))
            {
                System.out.println("Not a Palindrome");
                return;
            }
            start++;
            end--;
          }
          System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        String str="madam";

        Palindrome(str);

    }
}
