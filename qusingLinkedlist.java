public class qusinglinkedlist
{
    Node front,rear;
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    qusinglinkedlist() {
        front = rear = null;
    }
    public void enqueue(int val)
    {
        Node newnode = new Node(val);
        if (isempty())
        {
            front=rear=newnode;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
        }
    }
    public int dequeue()
    {
        if (isempty())
        {
            throw new IllegalStateException();
        }
        int val = front.data;
        front=front.next;
        if (front==null)
        {
            rear=null;
        }
        return val;
    }
    public int peek()
    {
        if (isempty())
        {
            throw new IllegalStateException();
        }
        return front.data;
    }

    public boolean isempty()
    {
        return front==null;
    }
    
    public static void main(String[] args)
    {
        qusinglinkedlist q = new qusinglinkedlist();
        q.enqueue(45);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(21);
        q.enqueue(76);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("front element is: ");
        System.out.println(q.peek());
    }
    
    
}
