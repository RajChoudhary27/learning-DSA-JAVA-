// WAP to count the following:(Programming in cpp  @)
//total characters
//total words
//total upparcase,lowercase,digits,total special characters.
public class Ques2 {
    public static void main(String[] args) {
        String str="Hello World";
        int length=str.length();
        int character=0;
        int words=0;
        int upper=0;
        int lower=0;
        int digit=0;
        int special=0;

        for(int i=0;i<str.length();i++)
        {
             if(str.charAt(i)=='a' && str.charAt(i)=='z')
                {
                    lower++;
                }
             else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    upper++;
                }
             else if(str.charAt(i)==' ')
                {
                    words++;
                }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
                {
                    digit++;
                }
             else{
                special++;
             }
        }

        System.out.println("Characters :- "+str.length());
        System.out.println("Words :- "+(words+1));
        System.out.println("Uppercase letters :- "+upper);
        System.out.println("Lowercase letters :- "+lower);
        System.out.println("Digits :- "+digit);
        System.out.println("Special characters :- "+special);

    }
}
