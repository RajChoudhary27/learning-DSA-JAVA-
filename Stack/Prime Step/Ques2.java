// 2. To reverse print given string using stack
class Stack
{
   int[] arr;
   int capacity;
   int top=-1;
   int size=0;
   Stack(int size)
   {
    capacity=size;
    arr=new int[size];
   }
   void push(int element)
   {
    if(top==capacity-1)
    {
        System.out.println("Stack Overflow");
    }
    else{
        top++;
        arr[top]=element;
        size++;
    }
   }
   void print()
   {
    if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
    
    for(int i=0;i<=size;i++)
    {
        System.out.println(arr[i]);
    }
   }
}
public class Ques2 {
    
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
    }
}
