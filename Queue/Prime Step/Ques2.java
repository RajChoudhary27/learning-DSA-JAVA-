/*
Stack behaving like Queue
*/

class Queue {

    int capacity;
    int[] arr;
    int top = -1;

    Queue(int size) {
        capacity = size;
        arr = new int[size];
    }

    // PUSH (enqueue)
    void enqueue(int element) {

        if (top == capacity - 1) {
            System.out.println("Queue Full");
            return;
        }

        arr[++top] = element;
    }

    // REMOVE FIRST INSERTED ELEMENT
    int dequeue() {

        if (top == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        // reverse stack
        int[] temp = new int[capacity];
        int t = -1;

        while (top != -1) {
            temp[++t] = arr[top--];
        }

        // remove front element
        int x = temp[t--];

        // restore stack
        while (t != -1) {
            arr[++top] = temp[t--];
        }

        return x;
    }
}

public class Ques2 {

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); //10
        System.out.println(q.dequeue()); //20
    }
}
