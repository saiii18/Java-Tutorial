// public class binarytree{
//     Node root;
//     class Node{
//         int data;
//         Node left;
//         Node right;

//         Node (int val){
//             data=val;
//             left=right=null;
//         }
//     }
//     binarytree(int val){
//         root=new Node(val);
//     }
//     public void insertleft(Node r, int val){
//         Node newnode = new Node(val);
//         r.left=newnode;
//     }
//     public void insertright(Node r,int val){
//         Node newnode=new Node(val);
//         r.right=newnode;
//     }
//     public static void preorder(Node root){
//         if(root!=null){
//             System.out.println(root.data + " ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }
//     public static void inorder(Node root){
//         if(root!=null){
//             inorder(root.left);
//             System.out.println(root.data + " ");
//             inorder(root.right);
//         }
//     }
//     public static void postorder(Node root){
//         if(root!=null){
//             postorder(root.left);
//             postorder(root.right);
//             System.out.println(root.data + " ");
//         }
//     }
//     public static void main(String[] args){
//         binarytree bt=new binarytree(10);
//         bt.insertleft(bt.root,5);
//         bt.insertright(bt.root,15);
//         bt.insertleft(bt.root.left,3);
//         bt.insertright(bt.root.left,8);
//         bt.insertleft(bt.root.right,12);

//         System.out.print("Preorder Traversal : ");
//         bt.preorder(bt.root);
//         System.out.println();
//         System.out.print("inorder Traversal : ");
//         bt.inorder(bt.root);
//         System.out.println();
//         System.out.print("Postorder Traversal : ");
//         bt.postorder(bt.root);
//         System.out.println();

//     }
// }
