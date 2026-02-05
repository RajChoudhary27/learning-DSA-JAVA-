class Node{
    int data;
    Node next;
    
}
public class InsertionLL
{
    public static void printLL(Node Head)
    {
        Node Current=Head;
        while(Current!=null)
        {
            System.out.print(Current.data);
            System.out.print(" -> ");
            Current=Current.next;
        }
        System.out.println("Null");
    }
    
    public static Node InsertAtEnd(Node Head,int data)
    {
       Node newNode=new Node();
       newNode.data=data;
       newNode.next=null;
       
       if(Head==null)
       {
           return newNode;
       }
     
           Node current=Head;
           while(current.next!=null)
           {
               current=current.next;
           }
       current.next=newNode;
       return Head;
    }
    
    public static Node InsertAtFirst(Node Head,int data)
    {
        Node newNode=new Node();
         newNode.data=data;
         newNode.next=null;
        if(Head==null)
        {
            return newNode;
        }
        newNode.next=Head;
        return newNode;
    }
    
    public static Node InsertAtPosition(Node Head,int data,int pos)
   {
       Node newNode=new Node();
       newNode.data=data;
       newNode.next=null;
       
       Node current=Head;
        for(int i=0;i<pos-2;i++)
        {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
        return Head;
    
   }
	public static void main(String[] args) {
     Node Head=new Node();
     Head.data=10;
     Head.next=null;
     
    Head=InsertAtEnd(Head,20);
     printLL(Head);
     
    Head=InsertAtFirst(Head,5);
     printLL(Head);
     
    Head=InsertAtPosition(Head,15,3);
     printLL(Head);
     
 	}
}
