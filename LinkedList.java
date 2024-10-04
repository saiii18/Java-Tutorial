import java.util.*;
class LinkedList {
    static class node {
        int data;
        node next;

        public node(int val) {
            data = val;
            next = null;
        }
    }
    public node head = null;
    public node tail = null;

    public void insertatfirst(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }
    public void dellast()
    {
        node temp=head;
        if(temp==null && temp.next==null)
        {
            System.out.println("list is null");
        }
        else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void display()
    {
        node current=head;
        if(head==null)
        {
            return;
        }
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the list elements:\n");
        int n=sc.nextInt();
        while(n!=-1)
        {
            list.insertatfirst(n);
            n = sc.nextInt();
        }
        list.display();
        list.dellast();
        list.display();
    }
}