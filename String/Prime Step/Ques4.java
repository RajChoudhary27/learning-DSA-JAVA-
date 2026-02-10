//tittle
public class Ques4 {
   public static void main(String[] args) {
    String str="Progamming in java";

    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        
        
            if(i==0 && ch>='a'  && ch<='z')
            {
               
                ch=(char)(ch-32);
            }
        
        else if(i > 0 && str.charAt(i - 1) == ' ' && ch >= 'a' && ch <= 'z')
        {
           
                ch=(char)(ch-32);
                
            
        }
        
        System.out.print(ch);
    }
   } 
}
