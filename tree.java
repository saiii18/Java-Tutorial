import java.util.*;
class tree
{
    class node
{
    int data;
    node left,right;
    int height;
    public node(int val)
    {
        data=val;
        left=right=null;
    }
}
    node create(int data)
    {
        return new node(data);
    }
    node insert(node root,int data)
    {
        if(root==null)
        {
            return create(data);
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    public void levord(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            node current=q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)
            {
                q.add(current.left);
            }
            if(current.right !=null)
            {
                q.add(current.right);
            }
        }
    }
    public static void preorder(node root)
    {
        if (root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void postorder(node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public int height(node root)
    {
        if(root==null)
        {
            return -1;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public node search(node root, int key)
    {
        if(root==null || root.data==key)
        {
            return root;
        }
        if(key<root.data)
        {
            return search(root.left,key);
        }
        return search(root.right,key);
    }
    public int leaf(node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return leaf(root.left)+leaf(root.right);
    }
    public static void main(String[] args)
    {
        tree t1=new tree();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the root node:");
        int k=sc.nextInt();
        node root=t1.create(k);
        System.out.println("enter the nodes:");
        while(true)
        {
            int data=sc.nextInt();
            if(data==-1)
            {
                break;
            }
            t1.insert(root,data);
        }
        System.out.println("level order:");
        t1.levord(root);
        System.out.println();
        System.out.println("preorder:");
        preorder(root);
        System.out.println();
        System.out.println("inorder:");
        inorder(root);
        System.out.println();
        System.out.println("postordeer:");
        postorder(root);
        System.out.println();
        System.out.println("height of the tree: "+t1.height(root));
        System.out.println("enter search element:");
        int s=sc.nextInt();
        node result = t1.search(root,s);
        if(result!=null)
        {
            System.out.println("element found");
        }
        else {
            System.out.println("element not found");
        }
        System.out.println("to count the leaf nodes:"+t1.leaf(root));
    }
}