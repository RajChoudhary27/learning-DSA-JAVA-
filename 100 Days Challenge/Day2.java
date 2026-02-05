// Ques-2 ->WAP to print Fabonacii series upto n elements ?
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range :- ");
        int num=sc.nextInt();

        int first=0;
        int second=1;
        int i=0;
        while(i<=num)
        {
               System.out.print(first +" ");
               int third=first+second;
               first=second;
               second=third;
               i++;
        }
    }
}
