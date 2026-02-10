// apple a->p  p->a
public class Ques3 {
    public static void main(String[] args) {
        String str="apple";

        for(int i=0;i< str.length();i++)
        {
           char ch=str.charAt(i);
           if(ch=='a'){
            ch='p';
            System.out.print(ch);
           }
           else if(ch=='p')
           {
            ch='a';
            System.out.print(ch);
           }
           else{
            System.out.print(ch);
           } 
        }
    }
}
