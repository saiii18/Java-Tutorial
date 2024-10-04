import java.util.*;
class priorityqueue
{
        Node head;
        class Node
        {
            int data;
            int p;
            Node next;

            Node(int val,int k)
            {
                data=val;
                p=k;
                next=null;
            }
        }
        priorityqueue()
        {
            head=null;
        }

        public void enqueue(int val,int p)
        {
            Node newnode = new Node(val,p);
            if(head==null)
            {
                head=newnode;
            }
            else
            {
                if (head.p > p )
                {
                    newnode.next=head;
                    head=newnode;
                }
                else
                {
                    Node temp=head;
                    while(temp.next!=null && temp.next.p < p)
                    {
                        temp=temp.next;
                    }
                    newnode.next=temp.next;
                    temp.next=newnode;
                }
            }
        }

        public void dequeue()
        {
            head=head.next;
        }

        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        priorityqueue pq = new priorityqueue();
        pq.enqueue(10,2);
        pq.enqueue(2,0);
        pq.enqueue(14,1);
        pq.enqueue(23,3);
        System.out.println("enqueue : ");
        pq.display();
        
        pq.dequeue();
        pq.dequeue();
        System.out.println("after dequeue : ");
        pq.display();
    }
}
