//Panagram
public class Ques8 {
    public static void main(String[] args) {
        String str="A quick brown Fox jump over the lazy dog.";
        boolean[] freq=new boolean[26];
        int index;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                index=ch-'a';
            }
            else if(ch>='A' && ch<='Z'){
                index=ch-'A';
            }
            else{
                continue;
            }
         freq[index]=true;
        }
    
   for(int x=0;x<freq.length;x++)
   {
        if(!freq[x])
        {
            System.out.println("Not a Panagram");
            return;
        }
   }
   System.out.print("Panagram");
}
}
