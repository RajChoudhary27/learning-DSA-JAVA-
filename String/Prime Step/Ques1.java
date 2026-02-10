//WAP to convert lower case into uppar case
public class Ques1 {
    public static void main(String[] args) {
        String str = "hello";
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            
            System.out.print(ch);
        }
    }
}

