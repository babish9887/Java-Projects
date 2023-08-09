import java.util.Scanner;
public class bst {
    static treenode root=null, temp, prev;
    public static void main(String[] args) {
        int ch=0; 
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\n\n1. Insert node\n2. Delete node\n3. Display Tree\n 4.Exit\n   Enter Your Choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.print("Enter Data: ");
                    InsertNode(sc.nextInt());
                    break;
                
                case 2: 
                    System.out.print("Enter data to Delete: ");
                    DeleteNode(sc.nextInt());
                    break;

                case 3: 
                    // DisplayTree();
                    System.out.print("Enter data to Search: ");
                    SearchTree(sc.nextInt());
                    break;

                case 4:
                    System.exit(0);
                    break;

           }
        }while(ch!=0);
    }

    static void SearchTree(int data){
        Search(root, data);
    }

    static void Search(treenode root, int data){
        if(root==null)
            System.out.println("There is no Element for Search");
        else if(root.data==data)
        System.out.println("Data found");
        else if(data<root.data)
            Search(root.left, data);
        else if(data>root.data)
            Search(root.right, data);
    }

    static void InsertNode(int data){
        treenode newnode=new treenode(data);
        if(root==null)
            root=newnode;
        else{
            temp=root;
            while(temp!=null){
                prev=temp;
                if(data<temp.data)
                    temp=temp.left;
                else    
                    temp=temp.right;
            }
        if(data<prev.data)
            prev.left=newnode;
        else
            prev.right=newnode;
        }
    }

    static void DeleteNode(int data){
        if(root==null)
            System.out.println("Tree is Empty");
        else{
            temp=root;
            while(temp!=null && temp.data!=data){
                prev=temp;
                if(data<temp.data)
                    temp=temp.left;
                else
                    temp=temp.right;
            }
           
            treenode node=temp;
            if(node!=null && node.data==data){
                if(temp.right==null && temp.left==null){
                    prev.right=null;
                    prev.left=null;
                }
                else if(temp.right==null)
                    temp=temp.left;
                else if(temp.left==null)
                    temp=temp.right;
                else{
                    System.out.println(temp.data);
                    treenode temp1=temp.left;
                    while(temp1.right!=null){
                        temp1=temp1.right;
                    }
                    temp1.right=temp.right;
                    temp.data=temp.left.data;
                    temp.left=temp.left.left;
                }
            }
        }
    }

    static void DisplayTree(){
        inorder(root);
    }

    static void inorder(treenode root){
        if(root!=null){
            inorder(root.left);
            System.out.print("  "+root.data);
            inorder(root.right);
        }
    }

}
class treenode{
        int data;
        treenode left=null;
        treenode right=null;
        treenode(int d){
            data=d;
        }
    }