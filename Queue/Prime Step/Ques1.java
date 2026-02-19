//Perform following Operations on Queue
//a) Enqueue
//b) Dequeue
//c) Display

class Queue {

    int[] arr;
    int capacity;
    int front;
    int rear;

    Queue(int size) {
        capacity = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int element) {
        if (front == capacity - 1) {
            System.out.print("Queue is already full..");
            return;
        } else if (front == -1) {
            rear++;
            arr[++front] = element;
            return;
        }
        arr[++rear] = element;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty..");
        }
        int x = arr[front];
        front++;
        return x;
    }
}

public class Ques1 {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        q.display();
    }
}
