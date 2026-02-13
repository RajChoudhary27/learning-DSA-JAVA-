//Ques-9 ->Given an integer n,return if its power of two,otherwise false.

public class Day9 {
    static boolean ispower(int n)
    {
        if (n<=0)
        return false;
      while(n%2 ==0)
        {
            n=n/10;
        }
      
       return n==1;
    }
    public static void main(String[] args) {
       int n=16;
       System.out.print(ispower(n));
    }
}
