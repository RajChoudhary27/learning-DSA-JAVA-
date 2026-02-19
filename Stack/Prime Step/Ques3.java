// 3. To check if given string is palindrome or not, using user defined stack
class Stack
{
    char arr[];
    int capacity=-1;
    int top=-1;
    Stack(int size)
    {
        capacity=size;
        arr=new char[capacity];
    }

void push(char element)
{
    if(top==capacity-1)
        System.out.println("Stack Overflow..");
    else{
        top++;
        arr[top]=element;
    }
  
}
char pop()
{
    if(top==-1)
    {
        System.out.println("Stack Underflow");
    return '\0';
    }
    else 
        return arr[top--];
}
void palindrome(String str)
{
   
    if(top==capacity-1)
    {
        System.out.println("Stack Overflow");
        return;
    }
    else{
    for(int i=0;i<str.length();i++)
     {
       push(str.charAt(i));
     }
    }
    String rev="";
     for(int i=0;i<str.length();i++)
     {
        rev=rev+pop();
     }
     if(rev.equals(str))
        System.out.println("Palindrome String");
    else
        System.out.println("Not Palindrome");

}
}

public class Ques3 {


    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.palindrome("121121");
    }
}
