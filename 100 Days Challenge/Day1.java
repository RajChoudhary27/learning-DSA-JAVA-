// Ques-1 -> WAP to check Whether an given Number is Palindrome or not ?
import java.util.Scanner;
public class Day1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : - ");
            int num = sc.nextInt();
            int copy = num;
            int rem = 0;
            while(num > 0) {
                int digit = num % 10;
                rem = rem * 10 + digit;
                num /= 10;
            }

            if(copy == rem)
                System.out.println(copy + " is Palindrome Number");
            else
                System.out.println(copy + " is not a Palindrome Number");
        }
    }
    
}
