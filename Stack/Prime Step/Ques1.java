// 1. To get minimum data from stack in O(1)
class Stack{
   int[] arr;
   int Top=-1;
   int capacity;
    Stack(int size)
    {
        capacity=size;
         arr=new int[size];
    }
void push(int element)
{
   if(Top==capacity-1)
    {
         System.out.print(" Stack Overflow");
    } 
    else{
        Top++;
        arr[Top]=element;
    }
}
void print()
{
    if(Top==-1)
    {
        System.out.println(" Stack Underflow");
        return;
    }
   for(int i=Top;i>=0;i--)
   {
    System.out.println(arr[i]);
   }
}
void peek()
{
    if(Top==-1)
       {
         System.out.println("Stack is empty.");
         return;
       }
    else
    System.out.println(arr[Top]);
}
void pop()
{
    if(Top==-1)
    {
        System.out.println("Stack Undeflow");
        return ;
    }
    Top--;
}
void minimum()
{
   int min=arr[Top];

}
}

public class Ques1 {
   
    public static void main(String[] args) {
        Stack s= new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
         s.peek();
         s.pop();
         s.print();
         s.minimum();
    }
}
